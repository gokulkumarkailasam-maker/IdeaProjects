import java.util.Scanner;

public class Employee_Salary_Details {
    public void employee_Salary_Details() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Employee Name :");
        String employeename = s.nextLine();

        System.out.println("Enter Employee ID :");
        String employeeid = s.nextLine();

        System.out.println("Enter Basic Salary :");
        Long basicsalary = s.nextLong();

        System.out.println("Transport Allowance :");
        int transportallowance = s.nextInt();

        System.out.println("House Rent Allowance :");
        int houserentallowance = s.nextInt();

        Long grosssalary = basicsalary + transportallowance + houserentallowance;
         System.out.println("-------Employee_Salary_Details-------");
         System.out.println("Employee Name :"+employeename);
         System.out.println("Employee ID :"+employeeid);
         System.out.println("Basic Salary :"+basicsalary);
         System.out.println("Transport Allowance :"+transportallowance);
         System.out.println("House Rent Allowance :"+houserentallowance);
         System.out.println("Gross Salary :"+grosssalary);

         s.close();

    }
    public static void main(String[]args) {
        Employee_Salary_Details t3 = new Employee_Salary_Details();
        t3.employee_Salary_Details();
    }
}
