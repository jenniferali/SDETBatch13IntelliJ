package com.syntax.class21;

import sun.security.rsa.RSAUtil;

import javax.xml.bind.SchemaOutputResolver;

public class Animal {
    String name;
    String color;
    String breed;
    int age;

    //THIS IS A CONSTRUCTOR:
    public Animal(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    void printInfo(){
        System.out.println("Name "+name+" Color "+color+" Breed "+breed+" Age "+age);
    }
}
class Dog extends Animal{

   public Dog(String name, String color, String breed, int age) {
       super(name, color, breed, age);
    }
}
class Cat extends Animal{

    public Cat(String name, String color, String breed, int age) {
        //System.out.println("Hamid please stop trying it will not work");
        super(name, color, breed, age);
        System.out.println("Hamid please stop trying it will not work");
    }
}