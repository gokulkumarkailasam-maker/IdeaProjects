package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class All_In_One {
    public static void main (String[]args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        WebElement login_Link = driver.findElement(By.id("login2"));
        login_Link.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement username_Field = driver.findElement(By.id("loginusername"));
        wait.until(ExpectedConditions.visibilityOf(username_Field));
        username_Field.sendKeys("gokulkumars");

        WebElement password_Field = driver.findElement(By.id("loginpassword"));
        wait.until(ExpectedConditions.visibilityOf(password_Field));
        password_Field.sendKeys("Gokul@33");
        WebElement login = driver.findElement(By.xpath("//button[@onclick='logIn()']"));
        login.click();

    }


}
