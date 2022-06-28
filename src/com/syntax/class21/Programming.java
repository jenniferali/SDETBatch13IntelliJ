package com.syntax.class21;
//Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
// then the message "I love programming languages" should be printed.
// If some String is passed to it, then in place of "programming languages" the value variable should be printed.
// Example, if we pass "Java", then "I love Java" should be printed.

public class Programming {
    void program () {
        System.out.println("I love programming languages");
    }
        void program(String language) {
            System.out.println("I love Java");
        }
        public static void main (String[] args){
            Programming p = new Programming();
            p.program();
            p.program("Java");
        }
    }



