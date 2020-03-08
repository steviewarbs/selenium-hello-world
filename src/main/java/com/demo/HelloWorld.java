package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

    public static void main(String[] args) throws InterruptedException {

        //Initialise Chrome driver.
        WebDriver driver = new ChromeDriver();
        //Launch URL
        driver.get("https://www.bbc.co.uk/");
        //Maximise the browser window
        driver.manage().window().maximize();
        //Close down the session and clear cookies
        //Add short Thread sleep (Note this is not the ideal way to do this)
        Thread.sleep(5000);
        //Close down the session and clear cookies
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();

    }
}
