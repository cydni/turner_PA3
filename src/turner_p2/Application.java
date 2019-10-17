package turner_p2;
import java.util.Scanner;

public class Application {

    public static void main(String[] args){

        //Instantiate 2 SavingsAccount objects
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        //Change private class variable annualInterestRate rate to 4%
        SavingsAccount.modifyInterestRate(0.04);

        //Calculate Monthly Interest at 4% for both objects
        System.out.print("saver 1 -- ");
        saver1.calculateMonthlyInterest();
        System.out.print("saver 2 -- ");
        saver2.calculateMonthlyInterest();

        System.out.println();

        //Change private class variable annualInterestRate 5%
        SavingsAccount.modifyInterestRate(0.05);

        System.out.print("saver 1 -- ");
        saver1.calculateMonthlyInterest();
        System.out.print("saver 2 -- ");
        saver2.calculateMonthlyInterest();
    }
}
