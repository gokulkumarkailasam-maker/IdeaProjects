public class Tov {
    int d = 99;
    float g1 = 676;
    byte g = 2;
    public void add() {
        int c = 50;
        byte b = 23;
        System.out.println("class variable: "+d);
        System.out.println(g1);
        System.out.println("local variable: "+b);
        System.out.println("class variable without initialize: "+g);
        System.out.println("local variable: "+c);

    }
    int e = 97;
    float b = 6;
    public void sub() {
        short g1 = 999;
        int d = 102;
        System.out.println("____________________");
        System.out.println("instance variable: "+e);
        System.out.println("class variable: "+b);
        System.out.println("local variable: "+d);
        System.out.println(g1);
    }
    public static void main(String[]args) {
        Tov tv = new Tov();
        tv.add();
        tv.sub();
        tv.multi();


    }
    public void multi() {
        int a = 50;
        int b = 100;
        int c = a*b;
        System.out.print("value: "+c);
    }
}
