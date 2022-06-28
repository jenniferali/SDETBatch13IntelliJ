package com.syntax.class17;

public class Task1SyntaxEmployee {
    /*
    Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects
     */
    String empId;
    int salary;
    // If 2 objects of a class could have different values for
    //a variable, or if the variable is shared between two or more methods of that
    //class, INSTANCE variables should be used.

    static String CEO = "Sumair";

    public static void main(String[] args) {
        Task1SyntaxEmployee emp = new Task1SyntaxEmployee();
        emp.empId = "123";
        emp.salary = 200000;

        Task1SyntaxEmployee emp2=new Task1SyntaxEmployee();
        emp2.empId="1234";
        emp2.salary=250000;

        System.out.println(emp.empId);
        System.out.println(emp.salary);
        System.out.println(CEO);

        System.out.println(emp2.empId);
        System.out.println(emp2.salary);
        System.out.println(CEO);

    }
}
