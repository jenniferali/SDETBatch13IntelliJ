package com.syntax.class16;

import com.syntax.class17.Employee;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name="Merve";
        //  employee.salary=125000 inaccessible, is private in class17
        // employee.department="IT"; inaccessible, is Default
        // and default is not accessible between 2 different packages

        System.out.println(Employee.manager);

        Employee.printManager();
        //Static fields and methods can also be accessed by just
        // writing the name of the class
    }

}
