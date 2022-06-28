package com.syntax.class21;
//Create 1 class with a private method that has 3 overloaded forms.
// Then call each overloaded method with specific arguments and observe result.

public class MethodOver2 {
    private void printInvisibleInk(String wizard) {
        System.out.println("Harry will be in the House of Gryffindor");
    }

    private void printInvisbleInk(int price,String wizard) {
        System.out.println("9 Galleons is what Ron paid for fake invisible ink!");
    }

    private void printInvisbleInk(String wizard, int price, String house) {
        System.out.println("Hermione turned down 100 Galleons to join Ravenclaw...");
    }

    public static void main(String[] args) {

        MethodOver2 m = new MethodOver2();

        m.printInvisibleInk("Harry");
        m.printInvisbleInk(10,"Hermione");
        m.printInvisbleInk("Ron",100,"Ravenclaw");

    }
}

