import java.util.Scanner;

public class Bank_Account_Statement {
    public void bank_Account_Statement() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Account Holder Name:");
        String accountholdername = s.nextLine();

        System.out.println("Enter Account Number:");
        Long accountnumber = s.nextLong();

        System.out.println("Enter Current Balance:");
        Double currentbalance = s.nextDouble();

        System.out.println("Enter Deposit Amount:");
        Double depositamount = s.nextDouble();

        System.out.println("Enter Withdraw Amount:");
        Double withdrawamount = s.nextDouble();

        Double newbalance = currentbalance + depositamount - withdrawamount;

        System.out.println("------Bank Account Statement------");
        System.out.println("Account Holder Name:"+accountholdername);
        System.out.println("Account Number:"+accountnumber);
        System.out.println("Current Balance:"+currentbalance);
        System.out.println("Deposit Amount:"+depositamount);
        System.out.println("Withdraw Amount:"+withdrawamount);
        System.out.println("New Balance:"+newbalance);



    }
    public static void main(String[]args) {
        Bank_Account_Statement t2 = new Bank_Account_Statement();
        t2.bank_Account_Statement();
    }
}
