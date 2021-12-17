package com.company;

import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        model.add(readLine(scanner));
        System.out.println(model);
    }

    private String[] readLine(Scanner sc) {
        String name="";
        String nickname="";
        while (sc.hasNextLine()) {
            String[] line=sc.nextLine().split(" ");
            while (line.length!=2) {
                System.out.println(View.NO_DATA);
                line=sc.nextLine().split(" ");
            }
            name = line[0];
            nickname = line[1];
            if (!checkName(name) || !checkNickname(nickname)) {
                System.out.println(View.WRONG_DATA);
                continue;
            }
            break;
        }
        return new String[]{name,nickname};
    }

    private boolean checkName(String name) {
        String regex = "^[a-zA-Z]{1,}$";
        return name.matches(regex);
    }

    private boolean checkNickname(String nickname) {
        String regex = "^[a-zA-Z\\d]{1,}$";
        return nickname.matches(regex);
    }
}
