package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

    /**
     * 1. launch the browser
     * 2. navigate to amazon web site
     * 3. print out the title and the url in the console
     * 4. close the browser
     */

    public static void main(String[] args) {                                    // main method
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");  // set property
        WebDriver driver = new ChromeDriver();                                  // launch browser
        driver.get("http://www.amazon.com");                                    // navigate to website
        String title = driver.getTitle();                                       // get title with variable "title"
        String url = driver.getCurrentUrl();                                    // get url with variable "url"
        System.out.println(title + " " + url);                                  // concatenate title with a space and url
        driver.quit();                                                          // closed browser
    }
}