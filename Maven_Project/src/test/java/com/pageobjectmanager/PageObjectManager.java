package com.pageobjectmanager;

import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.SearchPage;
import com.utility.FileReaderManager;

public class PageObjectManager {
    public static FileReaderManager fileReaderManager;
    private static PageObjectManager pageObjectManager;
    private static LoginPage loginPage;
    private static SearchPage searchPage;

    public static  FileReaderManager getFileReaderManager() {
        if (fileReaderManager==null) {
            fileReaderManager = new FileReaderManager();
        }
        return fileReaderManager;
    }
    public static PageObjectManager getPageObjectManager() {
        if(pageObjectManager == null) {
            pageObjectManager = new PageObjectManager();
        }
        return pageObjectManager;
    }
    public static LoginPage getLoginPage() {
        if(loginPage==null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }
    public static SearchPage getSearchPage() {
        if(searchPage == null) {
            searchPage = new SearchPage();
        }
        return searchPage;
    }
}
