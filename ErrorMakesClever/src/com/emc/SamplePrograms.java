package com.emc;

import java.util.Scanner;

public class SamplePrograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Score:");
        int score = scan.nextInt();

        if (score < 50) {
            System.out.println("You need to improve");
        } else if (score >= 50 && score <= 70) {
            System.out.println("Good job");
        } else {
            System.out.println("Excellent");
        }
        System.out.println("------------------------------");

        System.out.print("Subject 1 mark:");
        int subject1 = scan.nextInt();
        System.out.print("Subject 2 mark:");
        int subject2 = scan.nextInt();
        System.out.print("Subject 3 mark:");
        int subject3 = scan.nextInt();
        System.out.print("Subject 4 mark:");
        int subject4 = scan.nextInt();
        System.out.print("Subject 5 mark:");
        int subject5 = scan.nextInt();

        int average = (subject1 + subject2 + subject3 + subject4 + subject5) / 5;
        System.out.println("Average:" + average);

        if (average < 35) {
            System.out.println("Additional class is required");
        } else {
            System.out.println("Good to go");
        }
        System.out.println("-----------------------");

        scan.nextLine();

        System.out.print("Colour:");
        String colour = scan.nextLine();

        if (colour.equals("red")) {
            System.out.println("STOP");
        } else if (colour.equals("yellow")) {
            System.out.println("GET READY");
        } else if (colour.equals("green")) {
            System.out.println("GO");
        }
        System.out.println("------------------------------");

        System.out.print("Salary:");
        int salary = scan.nextInt();
        System.out.print("Age:");
        int age = scan.nextInt();

        if (salary >= 20000 || age <= 25) {
            System.out.println("Eligible for Loan");
            System.out.print("Enter Loan Amount:");
            int loanAmount = scan.nextInt();
            if (loanAmount <= 50000) {
                System.out.println("Loan Available");
            } else {
                System.out.println("Loan amount limit exceeds");
            }
        } else {
            System.out.println("Not Eligible for Loan");
        }
        System.out.print("num1:");
        int num1 = scan.nextInt();
        System.out.print("num2:");
        int num2 = scan.nextInt();

        String result = num1 < num2 ? "correct" : "Not correct"; //ternary operator
        System.out.println(result);

        System.out.print("variable A:");
        int variable_A = scan.nextInt();
        System.out.print("variable B:");
        int variable_B = scan.nextInt();

        for (int i = variable_A; i <= variable_B; i = i + 1) {
            System.out.print(i);
        }
        for (int i = 1; i <= 10; i = i + 1) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
            else {
                System.out.print(i);
            }
        }
    }
}


