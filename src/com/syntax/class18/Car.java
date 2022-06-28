package com.syntax.class18;

public class Car {

    private String make;
    private String model;
    private String color;

    public Car() {

    }
    public Car(String carMake, String carModel, String carColor) {
        make = carMake;
        model = carModel;
        color = carColor;
    }
    public Car(String carModel){
        model=carModel;
    }
    //Two contructors within a class with same # of paramets and same type
    //IS NOT ALLOWED
    //public Car(String carModel){
        //model=carModel;

    void printCarModel(){
        System.out.println("Model "+model);
    }
    void printInfo(){
        System.out.println("Make "+make+" Model "+model+" Color "+color);
    }

}
