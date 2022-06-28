package com.syntax.intro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeBrowserDemo {
    public static void main(String[] args) {
        //1. set a system property
        // Use this path for mac
       System.setProperty("webdriver.chrome.driver","/Users/jenniferali/IdeaProjects/SDETBatch13/untitled/drivers/chromedriver");

       //2. Create an object of webdriver type
         WebDriver driver=new ChromeDriver();

         //3. navigate to Syntax application
        driver.get("http://syntaxtechs.com");

    }
}
