package com.syntax.class23;

public class PolymorphismDemo1 {

    void doSomething(String name) {
        System.out.println("Downloading a movie from the internet"+name);
    }
    void doSomething(int num) {
        System.out.println("Calculating the text based on new rules");
    }
}

class PolyTester {
    public static void main(String[] args) {
        PolymorphismDemo1 p = new PolymorphismDemo1();
        p.doSomething(10);
    }
}
