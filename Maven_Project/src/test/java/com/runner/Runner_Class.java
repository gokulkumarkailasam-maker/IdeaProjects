package com.runner;

import com.base.Base_Class;
import com.pageobjectmanager.PageObjectManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Runner_Class extends Base_Class{
    public static void main(String[] args) throws IOException, InterruptedException {
        launchBrowser(PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("browser"));
        launchUrl(PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("url"));
        PageObjectManager.getPageObjectManager().getLoginPage().validLogin();
        //PageObjectManager.getPageObjectManager().getSearchPage().searchProduct();




    }

}
