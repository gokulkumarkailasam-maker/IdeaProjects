import java.util.Scanner;

public class ScannerMethods {
    public void runtimeInputs() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = s.nextLine();

        System.out.println("Enter your surname:");
        String surname = s.nextLine();

        System.out.println("Enter your age:");
        int age = s.nextInt();

        System.out.println("-------Application form------");
        System.out.println("Your Name:"+name);
        System.out.println("Your Surname:"+surname);
        System.out.println("Your Age:"+age);
        s.close();


    }
    public static void main(String[]args) {
        ScannerMethods sm = new ScannerMethods();
        sm.runtimeInputs();
    }
}
