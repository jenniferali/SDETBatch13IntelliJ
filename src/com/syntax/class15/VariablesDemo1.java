package com.syntax.class15;

public class VariablesDemo1 {

    String breed; //Instance variable
    static int num = 5; //static

    void printName() {
        String name = "local"; //local variable
        System.out.println(name);
    }

    public static void main(String[] args) {
        VariablesDemo1 v = new VariablesDemo1();
        v.printName();
    }
}