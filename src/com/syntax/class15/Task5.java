package com.syntax.class15;
//Create a method createEmail(). Based on values of users name, lastName and email type,
//your method should return complete email Address.
//Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
public class Task5 {
    String completeEmail(String firstName,String lastName, String emailType) {

        return firstName+lastName+"@"+emailType+".com";
    }
    public static void main(String[] args) {

        Task5 task= new Task5();

        System.out.println(task.completeEmail("Tara", "Sitara", "gmail"));
    }
}
