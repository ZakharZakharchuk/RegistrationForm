package com.company;

import java.util.HashMap;

public class Model {
    private HashMap<String,String>ob=new HashMap<>();
    public void add(String[]s){
        ob.put(s[0],s[1]);
    }

    @Override
    public String toString() {
        return "Model{" +
                "ob=" + ob +
                '}';
    }
}
