package com.syntax.class23;

public class Animal {

    void eat(){
        System.out.println("All the animals eat");
    }
}
class Panda extends Animal{
    //no other class can inherit from animal class cause its is declared final
    void eat(){
        System.out.println("All the animals eat");
    }
    Panda(){
        System.out.println("Child");
    }
}
class Tester{
    public static void main(String[] args) {
        new Panda();
    }
}
