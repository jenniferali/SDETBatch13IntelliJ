package com.syntax.class15;
//Create a method that will say Hello in different language based
// on the country that will passed when method is executed
public class Task4 {
    void sayHello (String country) {

        String hello;
        switch(country) {
            case"USA":
            hello="Hola";
            break;
            case "Russia":
                hello="Privet";
                break;
            case "France":
                hello="Bonjour";
                break;
            case "Pakistan":
                hello="Assalam o Alaykum";
                break;
            case "India":
                hello="Namaste";
                break;
            case "Turkiye":
                hello="Merhaba";
                break;
            default:
                hello="Country not found";

        }
        System.out.println(hello);
    }

    public static void main(String[] args) {
        Task4 task4= new Task4();
        task4.sayHello("France");
        task4.sayHello("Mars");
        task4.sayHello("Turkiye");
    }
}
