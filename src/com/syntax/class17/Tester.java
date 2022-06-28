package com.syntax.class17;

import com.syntax.class16.Dog;
import com.syntax.class17.Employee;
public class Tester {

    //The "static" inside pub stat void means it can be accessed with class
    //name and method. "Void" is a return type that returns nothing.
    //"Main" is the name of the method
    //(String[] args) are the parameters. This is a String array.
    // "main(String[] args)" is the signature of the method
    //"public static void main(String[] args)" = header of the method
    //the code below is the body
    public static void main(String[] args) {


        //If classes exist inside the same package, they are
        //imported AUTOMATICALLY (Employee)

        Employee employee = new Employee();
        employee.name = "Mike";
        //employee.salary = 125000 creates an error because
        // it is private in the"Employee" class!
        employee.department="IT Saver";
        //employee.printSalary(); is private, not accessible
        //Dog method must be imported from com.syntax.class16
        employee.printDepartment();

        Dog dog = new Dog();
    }
}
