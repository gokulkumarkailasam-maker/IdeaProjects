package com.utility;

import org.junit.Assert;
import org.openqa.selenium.devtools.v142.io.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReaderManager {
    private static FileInputStream fileInputStream;
    public static Properties properties;

    public static void setupProperty() {
        File file = new File("C:\\Users\\acer\\IdeaProjects\\Maven_Project\\src\\main\\resources\\TestData.properties");
        try {
            fileInputStream = new FileInputStream(file);
            properties = new Properties();
            properties.load(fileInputStream);

        }catch(IOException e) {
            Assert.fail("ERROR: OCCUR DURING FILE LOADING");

        }catch(NullPointerException e) {
            Assert.fail("ERROR: OCCUR DURING FILE READING");

        }
    }
    public static String getProperty(String Key) {
        setupProperty();
        String property = properties.getProperty(Key);
        return property;
    }

    public static void main(String[] args) {
        System.out.println(getProperty("url"));

     }
}
