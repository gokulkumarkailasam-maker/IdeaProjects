package com.keywords;

public class Static_Keyword {
    static int a = 100;
    static int b = 50;
    static int c = a+b;
    int d = a*b;
    public static void methodLevel() {
        System.out.println("Static keyword method level");
    }
    public void normalMethod() {
        System.out.println("Normal method level");
    }
    public static void main(String[]args) {
        methodLevel();
        Static_Keyword k = new Static_Keyword();
        k.normalMethod();
        k.methodLevel();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(k.d);

    }
}

