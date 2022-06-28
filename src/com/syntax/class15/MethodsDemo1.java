package com.syntax.class15;

public class MethodsDemo1 {
    void method() {
        System.out.println("I cant use print statements in a void type method");
        int num = 0;
        // return 0; not possible because this command "returns something
    }

    public static void main(String[] args) {
        MethodsDemo1 methodsDemo1 = new MethodsDemo1();
        // int x = methodsDemo1.method(); methods with return type can't be assigned to variables
    }
}