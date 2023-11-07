package com.selenium.features.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchTest {
    public static void main(String[] args) {
        //WebDriverManager.firefoxdriver().setup();
        //WebDriver driver = new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("#L2AGLb > div")).click();
        System.out.println("Page title is : " + driver.getTitle());

        //driver.quit();
    }

}
