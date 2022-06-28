package com.syntax.class16;
//Create a Class called Students
//Create three  variables  Name , ID  and  numberOfStudents
//Create three objects of the Students Class
//Set the value for  studentName , studentID and increment the numberOfStudents for each object
//Print out  total number of students
public class Students {

    String name;

    int id;

    static int noOfStudents = 0;

    public static void main(String[] args) {

        Students stu = new Students();
        stu.name = "Selda";
        stu.id = 001;
        noOfStudents++;

        Students stu2 = new Students();
        stu2.name = "Kat";
        stu.id = 002;
        noOfStudents++;

        Students stu3 = new Students();
        stu3.name = "Tatiana";
        stu.id = 003;
        noOfStudents++;

        System.out.println("The number of students is: " + noOfStudents);
    }
}
