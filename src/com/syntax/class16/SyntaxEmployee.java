package com.syntax.class16;

//Create a Class called SyntaxEmployee:
//Create three  variables  empID , salary and set the CEO to “Sumair”
//Create two objects of the class SyntaxEmployee
//Set the value of eID, salary for each of the objects
//Print out the eID , salary and  CEO for each of the objects

public class SyntaxEmployee {
int empID;

int salary;

static String CEO="Sumair";

    public static void main(String[] args) {

        SyntaxEmployee se = new SyntaxEmployee();
        se.empID = 001;
        se.salary = 80000;

        SyntaxEmployee se2 = new SyntaxEmployee();
        se2.empID = 002;
        se2.salary = 90000;

        System.out.println("Employee ID: "+se.empID+"  Salary: "+se.salary+"  CEO: "+CEO);

        System.out.println("Employee ID: "+se2.empID+"  Salary: "+se2.salary+"  CEO: "+CEO);

    }
}
