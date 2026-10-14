import java.util.Scanner;

public class StudentManagement {
    public void sm() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String studentname = s.nextLine();

        System.out.println("Enter Roll Number:");
        int rollnumber = s.nextInt();

        System.out.println("Enter Mark 1:");
        int mark1 = s.nextInt();

        System.out.println("Enter Mark 2:");
        int mark2 = s.nextInt();

        System.out.println("Enter Mark 3:");
        int mark3 = s.nextInt();

        char grade;
        int total;
        double average;

        total = mark1 + mark2+ mark3;
        average = total/3;

        if(average>=90) {
            grade = 'A';
        }
        else if(average>=75) {
            grade = 'B';
        }
        else if(average>=50) {
            grade = 'C';
        }
        else {
            grade = 'F';
        }
        System.out.println("-----Student Grade Sheet-----");
        System.out.println("Student Name:"+studentname);
        System.out.println("Roll Number:"+rollnumber);
        System.out.println("Subject 1:"+mark1);
        System.out.println("Subject 2:"+mark2);
        System.out.println("Subject 3:"+mark3);
        System.out.println("Total Marks:"+total);
        System.out.println("Average:"+average);
        System.out.println("Grade:"+grade);
        s.close();
    }
    public static void main(String[]args) {
        StudentManagement t1 = new StudentManagement();
        t1.sm();
    }
}
