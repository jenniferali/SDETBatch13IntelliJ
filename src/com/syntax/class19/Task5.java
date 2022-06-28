package com.syntax.class19;

public class Task5 {
    public static void main(String[] args) {
        Student student = new Student ("Best Student Ozkan", 99.9, 98.8, 95.9);
                student.calculateAvgGrade();

        Student student2 = new Student ("Bad Sameer", 60.1, 50, 27.3);
        student2.calculateAvgGrade();
    }
}
