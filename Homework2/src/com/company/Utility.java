package com.company;

import java.util.Scanner;

public class Utility {
    private View view;
    private Scanner scanner;

    public Utility(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }
    public String inputData(String message, String regex) throws MyException {
        view.printStringInput(message);
        String result=scanner.nextLine();
        if(result==null)
            throw new MyException("null");
        while(!(scanner.hasNext()&&result.matches(regex))){
            view.printWrongStringInput(message);
        }
        return result;
    }
}
