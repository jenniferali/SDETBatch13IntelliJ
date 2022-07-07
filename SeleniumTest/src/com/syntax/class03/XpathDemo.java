package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
        username.sendKeys("Tester");
        WebElement password= driver.findElement(By.xpath("//input[@type = 'password']"));    //returns webelement
        password.sendKeys("test");
        WebElement loginButton= driver.findElement(By.xpath("//input[@value = 'Login']"));
        loginButton.click();
        Thread.sleep(3000);
        driver.quit();

    }
}
