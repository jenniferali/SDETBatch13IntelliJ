package com.syntax.class19;

public class Teacher {
    //Write a Java program called Teacher.
    // Identify features and behaviour of that Class. Create 3 subclasses:
    // MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    // Test all 4 classes

    String name;

    String subject;

    int yrsOfExperience;

    String location;

   public void printInfo() {
        System.out.println("Name: "+name+"  Subject: "+subject+"  Years of Experience: "+yrsOfExperience+"  Location: "+location);

        }
    }


 class MathTeacher extends Teacher{

    MathTeacher(String name,String subject, int yrsOfExperience, String location) {
        this.name=name;
        this.subject=subject;
        this.yrsOfExperience=yrsOfExperience;
        this.location=location;


    }
    }
class ChemistryTeacher extends Teacher{

    ChemistryTeacher(String name, String subject, int yrsOfExperience, String location) {
        this.name = name;
        this.subject = subject;
        this.yrsOfExperience = yrsOfExperience;
        this.location = location;
    }
    }
class PianoTeacher extends Teacher {

    PianoTeacher(String name, String subject, int yrsOfExperience, String location) {
        this.name = name;
        this.subject = subject;
        this.yrsOfExperience = yrsOfExperience;
        this.location = location;
    }
}