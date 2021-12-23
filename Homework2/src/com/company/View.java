package com.company;

import java.util.Locale;
import java.util.ResourceBundle;

public class View implements TextConstatn {
    public static final ResourceBundle bundle = ResourceBundle.getBundle(
            //"com.company.messages", new Locale("en")
            "com.company.messages", new Locale("ua"));

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatination(String... mesagge) {
        StringBuilder result = new StringBuilder();
        for (String i : mesagge) {
            result.append(i);
        }
        return result.toString();
    }

    public void printStringInput(String message) {
        printMessage(concatination(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatination(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }
}
