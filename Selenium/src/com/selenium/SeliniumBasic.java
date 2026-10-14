package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumBasic {
    public static void main(String[]args) throws InterruptedException {
        browserLaunch();
    }
    public static void browserLaunch() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();
        driver.navigate().refresh();

        String page1 = driver.getTitle();
        System.out.println(page1);


        driver.navigate().to("https://www.flipkart.com/");
        String url = driver.getCurrentUrl();
        System.out.println(url);

        String page2 = driver.getTitle();
        System.out.println(page2);

        Thread.sleep(2000);

        driver.navigate().back();
        driver.close();


    }

}
