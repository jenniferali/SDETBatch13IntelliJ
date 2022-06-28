package com.syntax.class23;

public class StudentTester {


    public static void main(String[] args) {
        Student[] students ={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};

        for(int i=0; i< students.length; i++) {
            students[i].attendClass();
            students[i].studyDaily();
            students[i].writeAssignment();

        }
    }
}
