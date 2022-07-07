package com.syntax.class26;

public class Demo6 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;
        System.out.println(num1+num2+num3+num4+num5);
        //Whenever we have to store more than 3 values of the same type, which are
        //also logically connected, we should create an array for them
        String name="AbdulSamad";
        String name2="Kat";
        String name3="Adam";
        String name4="Bilal";
        String [] names = {"AbdulSamad","Kat", "Adam", "Bilal"};

        //Not a good fit for an array, because data is not the same logically
        String name5="James";
        String address= "NY";
        String movieName= "Thor";

        String[] arr={"James", "NY", "Thor"};

        Object [] array={10, 51.2, "Asghar"};



    }

}
