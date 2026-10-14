package com.keywords;

public class Super_This {
    int number = 1000;
    public void animal() {
        int num1 = 5;
        System.out.println("lion");
        this.method1();
        System.out.println(num1);
    }
    public Super_This() {
        System.out.println("Child class Default constructor");
    }
    String car ="BMW";
    public void method1() {
        System.out.println("BMW car");
    }
    public static void main(String[]args) {
        Super_This st = new Super_This();
        st.animal();
        st.method1();
    }
}
