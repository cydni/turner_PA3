package turner_p2;
import java.util.Scanner;

public class SavingsAccount {

    //Static variable to store annual interest for all account holders
    private static double annualInterestRate = 0.0;

    //Private instance variable indicating the amount the saver currently has on deposit
    private double savingsBalance;

    //default constructor
    public SavingsAccount(){

        savingsBalance = 0.0;
        annualInterestRate = 0.0;
    }

    //overload constructor
    public SavingsAccount(double savingsBalance){

        this.savingsBalance = savingsBalance;

    }

    public void calculateMonthlyInterest(){

        double monthlyInterest = (savingsBalance * annualInterestRate)/12;
        savingsBalance += monthlyInterest;
        System.out.println("Savings Balance: $" + savingsBalance);
    }

    public static void modifyInterestRate(double newInterestRate){

        annualInterestRate = newInterestRate;
        System.out.println("Interest Rate: " + annualInterestRate + "%");
    }
}
