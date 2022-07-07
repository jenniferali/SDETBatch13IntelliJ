package com.syntax.intro1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo1 {

    public static void main(String[] args) {

        //1. Set a system property
        // Use this path for Mac
        System.setProperty("webdriver.chrome.driver","/Users/jenniferali/IdeaProjects/SDETBatch13/SeleniumTest/drivers/chromedriver");

        //2. Create an object of webdriver type (launch browser)
        WebDriver driver = new ChromeDriver();

        //3. Navigate to Syntax application
        driver.get("https://syntaxtechs.com");


    }
}
