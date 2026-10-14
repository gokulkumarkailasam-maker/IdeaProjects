import java.util.Scanner;

public class Jump_Statement {
    public void jumpbreakq1() {
        for(int a=1; a<=10; a++) {
            if(a == 6) {
                break;
            }
            System.out.print(a);
        }
        System.out.print("       ");
    }
    public void jumpcontinueq2() {
        for(int b=1; b<=10; b++) {
            if(b==5) {
                continue;
            }
            System.out.print(b);
        }
        System.out.print("     ");

    }
    public void q3() {
        for(int c=1; c<=20; c++) {
            if(c%2 ==0) {
                continue;

            }
            System.out.print(c);
        }
        System.out.print("   ");
    }
    public void q4() {
        for(int d=1; d<=20; d++) {
            if(d%3 ==0) {
                continue;
            }
            System.out.print(d);
        }
    }
    public static void main(String[]args) {
        Jump_Statement Js = new Jump_Statement();
        Js.jumpbreakq1();
        Js.jumpcontinueq2();
        Js.q3();
        Js.q4();
    }
}