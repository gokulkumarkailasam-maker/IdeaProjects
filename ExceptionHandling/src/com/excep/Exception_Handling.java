package com.excep;

import java.io.File;
import java.io.FileReader;

public class Exception_Handling {
    public static void main(String[]args) {
        fileNotFound();
    }
    public static void fileNotFound() {
        System.out.println("Username");
        System.out.println("Password");

        int a = 10;
        int b = 0;

        try {

            int result = a / b;
            System.out.println("Result:" + result);
        }
        catch

        try {
            File gokul = new File("sample.txt");
            FileReader reader = new FileReader(gokul);
        }
        catch (Exception e) {
            //System.out.println(e);
            //e.printStackTrace();
        }

        System.out.println("Login Successfully");

    }
}
