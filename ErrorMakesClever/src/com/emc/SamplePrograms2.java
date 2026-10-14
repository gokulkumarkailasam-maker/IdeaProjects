package com.emc;

public class SamplePrograms2 {
    public static void main(String[]args) {
        int oddcount = 0;
        int evencount = 0;
        for(int i=1;i<=10;i=i+1) {
            if(i%2==0) {
                System.out.println(i);
                evencount = evencount+1;
            }
            else {
                System.out.println(i);
                oddcount=oddcount+1;

            }
            }
        System.out.println("evencount:"+evencount);

        System.out.println("oddcount:"+oddcount);

        }
    }

