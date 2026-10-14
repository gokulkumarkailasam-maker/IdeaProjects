package com.keywords;

public class This_Super extends Super_This {
    int number = 100;
    public void add() {
        String name = "Gokulkumar";
        super.animal();
        System.out.println("Addition");
        System.out.println("Parent Class_class variable :"+this.number);
        System.out.println("Child Class_class variable :"+super.number);
        System.out.println("Parent Class_local variable :"+name);
        System.out.println("Child Class_class variable :"+car);
    }
    public void sub() {
        System.out.println("Subtraction");
    }
    public This_Super() {
        System.out.println("Default Constructor");
    }
    public void mul() {
        System.out.println("Multiplication");
    }
    public static void main(String[]args) {
        This_Super ts = new This_Super();
        ts.add();
        ts.sub();
        ts.mul();
        ts.method1();
        ts.animal();
    }
}
