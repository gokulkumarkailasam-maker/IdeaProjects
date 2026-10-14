package com.pageobjectmodel;

import com.base.Base_Class;
import com.interfaceelements.LoginInterfaceElements;
import com.pageobjectmanager.PageObjectManager;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends Base_Class implements LoginInterfaceElements {

    @FindBy(id = login_Id)
    private static  WebElement login;

    @FindBy(id = username_Id)
    public static WebElement username;

    @FindBy(id = password_Id)
    public static WebElement password;

    @FindBy(xpath = signin_Xpath)
    public static WebElement signin;

    @FindBy(id = title_Id)
    public static WebElement title;


    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    public static void validLogin() throws IOException, InterruptedException {
clickElement(login);
explicitWaitVisibilityOf(username,5);

passInput(username, PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("user_name"));
passInput(password, PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("pass_word"));
clickElement(signin);

explicitWaitVisibilityOf(title,5);
getText(title);

Thread.sleep(500);
takesScreenshot("C:\\Users\\acer\\IdeaProjects\\Maven_Project\\Screenshot\\image.png");
    }
}
