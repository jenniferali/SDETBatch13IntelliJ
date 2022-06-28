package com.syntax.class23;
        // Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
        //Define common behavior within parent class and override some of the methods in child classes
        //Define some methods specific to child classes
        //Write example of achieving run time polymorphism
            public class Student {
                public void attendClass() {
                    System.out.println("Student attends class");
                }

                public void studyDaily() {
                    System.out.println("Student studies everyday");
                }

                public void writeAssignment() {
                    System.out.println("Student writes assignments");
                }
            }
            class SyntaxStudent extends Student {
                @Override
                public void attendClass() {
                    System.out.println("Syntax student attends class online ");
                }
                @Override
                public void writeAssignment() {
                    System.out.println("Student writes code in IntelliJ");
                }
                SyntaxStudent(){
                    System.out.println("Syntax student sometimes gets anxiety about keeping up! O_o");
                }
            }
            class CollegeStudent extends Student {
                @Override
                public void attendClass() {
                    System.out.println("College student attends class on campus ");
                }

                @Override
                public void writeAssignment() {
                    System.out.println("Student writes papers");
                }

                CollegeStudent() {
                    System.out.println("College student sometimes gets nervous about exams! -_-");

                }
            }
            class SchoolStudent extends Student {
                @Override
                public void attendClass() {
                    System.out.println("School student does not attend everyday");
                }

                @Override
                public void studyDaily() {
                    System.out.println("Student studies once a week");
                }

                @Override
                public void writeAssignment() {
                    System.out.println("Student writes notes in class to their friends");
                }

                SchoolStudent() {
                    System.out.println("School student sometimes worries about looking cool. :D");
                }
            }

