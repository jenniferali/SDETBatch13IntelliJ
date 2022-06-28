package com.syntax.class19;


public class TeacherTester {


    public static void main(String[] args) {

        MathTeacher mTeach=new MathTeacher("Ms. Newton", "math", 20, "Boston,MA");
        mTeach.printInfo();

        ChemistryTeacher cTeach= new ChemistryTeacher("Mr. Phillips", "chemistry", 30, "Dallas,TX");
        cTeach.printInfo();

        PianoTeacher pTeach = new PianoTeacher("Mrs.Patmore","music", 40, "Los Angeles,CA");


        }
    }
