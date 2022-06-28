package com.syntax.class23;

public class Parent {

    public static void eat(){
        System.out.println("I like to eat seafood ");
    }
    public static void sleep(){
        System.out.println("I like to sleep 8 hours");
    }
    public static void activity(){
        System.out.println("Go to beach");
    }
}
class Child extends Parent {
    public static void activity() {
        System.out.println("I am very religious");
    }
}
class ParentTester{
    public static void main(String[] args) {

        Child.sleep(); //Will print 8 hours because we did not change
        Child.activity(); //Will print our I am very religious because we overrided

        Parent.activity();
        Child.activity();
    }
}
