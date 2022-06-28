package com.syntax.class21;
//Create 1 class with a static method that has 3 overloaded forms.
// Then call each overloaded method with specific arguments and observe result.

public class MethodOver1 {

 static void smash(String name, int num) {
     System.out.println("Apollo smashes one plate.");
 }

    static void smash(int num, String name) {
        System.out.println("Two plates are smashed by Medusa. ");
 }

    static void smash(String name, int num, int num2) {

     System.out.println("Zeus smashes 1 plate, then 100.");
 }

    public static void main(String[] args) {
        MethodOver1 overload1 = new MethodOver1();
        overload1.smash("Apollo", 1);
        overload1.smash(2,"Medusa");
        overload1.smash("Zeus",1,100);

    }
}
