package com.company;

import java.util.Scanner;

public class Input implements Regex,TextConstatn {
    private View view;
    private Scanner scanner;
    private String name;
    private String login;

    public Input(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }
    public void input(){
        Utility utility=new Utility(view,scanner);
        this.name=utility.inputData(NAME_DATA,REGEX_NAME_LAT);
        this.login=utility.inputData(LOGIN_DATA,REGEX_LOGIN);
    }
}
