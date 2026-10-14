package com.typecasting;

public class Narrowing {
    public void explicit() {
        long L = 7886971726359L;
        int i = (int) L;
        System.out.println(i);
    }
    public static void main(String[]args) {
        Narrowing n = new Narrowing();
        n.explicit();
    }
}
