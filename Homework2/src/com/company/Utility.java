package com.company;

import java.util.Scanner;

public class Utility {
    private View view;
    private Scanner scanner;

    public Utility(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }
    public String inputData(String message, String regex){
        String result;
        view.printStringInput(message);
        while(!(scanner.hasNext()&&(result=scanner.nextLine()).matches(regex))){
            view.printStringInput(message);
        }
        return result;
    }
}
