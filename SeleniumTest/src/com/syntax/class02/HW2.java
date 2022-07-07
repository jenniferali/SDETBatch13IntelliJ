package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    //navigate to fb.com
    //click on create new account
    //fill up all the textboxes
    //click on sign up button
    //close the pop up
    //close the browser


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.fb.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Donia");
        driver.findElement(By.name("lastname")).sendKeys("Samir Ghanem");
        driver.findElement(By.name("reg_email__")).sendKeys("dsg@yahoo.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("dsgpassword");
        driver.findElement(By.id("month")).sendKeys("Feb");
        driver.findElement(By.id("day")).sendKeys("12");
        driver.findElement(By.id("year")).sendKeys("1990");
        driver.findElement(By.cssSelector("input.8esa[value='1']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("websubmit")).click();
       driver.quit();


    }

}