package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    //HW
    //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    //fill out the form
    //click on register
    //close the browser
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.findElement(By.id("customer.firstName")).sendKeys("Joe");
        driver.findElement(By.id ("customer.lastName")).sendKeys("Shmoe");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Whatever Dr");
        driver.findElement(By.id("customer.address.city")).sendKeys("Hicksville");
        driver.findElement(By.id("customer.address.state")).sendKeys("North Dakota");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123-456-7890");
        driver.findElement(By.id("customer.ssn")).sendKeys("987-65-4321");
        driver.findElement(By.id("customer.username")).sendKeys("ShmoeDog1");
        driver.findElement(By.id("customer.password")).sendKeys("iLoveMyGrill$");
        driver.findElement(By.id("repeatedPassword")).sendKeys("iLoveMyGrill$");
        Thread.sleep(3000);
        driver.findElement(By.className("button")).click();

        Thread.sleep(3000);
        driver.quit();
    }

}
