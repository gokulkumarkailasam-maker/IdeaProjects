import java.util.Scanner;

public class Switch {
    public void q1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1:");
        long num1 = sc.nextLong();
        System.out.print("Enter Number 2:");
        long num2 = sc.nextLong();
        System.out.print("Enter Operator(+,-,*,/)");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result= " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result= " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result= " + (num1 * num2));
                break;
            case '/':
                System.out.println("Result= " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
    public void q2() {
        int day = 8;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");

        }
    }
    public void q3() {
        int month = 1;
        switch (month) {
            case 12:
                System.out.println("December");
                break;
            case 11:
                System.out.println("November");
                break;
            case 10:
                System.out.println("October");
                break;
            case 9:
                System.out.println("September");
                break;
            case 8:
                System.out.println("August");
                break;
            case 7:
                System.out.println("July");
                break;
            case 6:
                System.out.println("June");
                break;
            case 5:
                System.out.println("May");
                break;
            case 4:
                System.out.println("April");
                break;
            case 3:
                System.out.println("March");
                break;
            case 2:
                System.out.println("February");
                break;
            case 1:
                System.out.println("January");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
    public void q4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Balance:");
        Long balance = sc.nextLong();
        System.out.println("Enter Deposit amount:");
        Long depositamount = sc.nextLong();
        System.out.println("Enter Withdraw amount:");
        Long withdrawamount = sc.nextLong();
        Long currentbalance = balance + depositamount - withdrawamount;
        int atm = 5;
        switch(atm) {
            case 1:
                System.out.println("Balance: "+balance);
                break;
            case 2:
                System.out.println("Deposit amount: "+depositamount);
                break;
            case 3:
                System.out.println("Withdraw amount: "+withdrawamount);
                break;
            case 4:
                System.out.println("Current Balance: "+currentbalance);
                break;
            case 5:
                System.out.println("Exit");
            default:
                System.out.println("Input is not valid");

        }
    }
    public void q5() {
        String grade = "A";
        switch(grade) {
            case "A":
                System.out.println("Student scored a mark between 90 to 100");
                break;
            case "B":
                System.out.println("Student scored a mark between 75 to 89");
                break;
            case "C":
                System.out.println("Student scored a mark between 60 to 74");
                break;
            case "D":
                System.out.println("Student scored a mark between 50 to 59");
                break;
            case "F":
                System.out.println("Student scored a mark below 50");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
    public static void main(String[]args) {
        Switch sw = new Switch();
        //sw.q1();
        //sw.q2();
        //sw.q3();
        //sw.q4();
        sw.q5();
    }
}
