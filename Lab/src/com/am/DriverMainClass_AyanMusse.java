package com.am;
import java.util.Scanner;

public class DriverMainClass_AyanMusse{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Run 1");
        System.out.print("Please enter your account number: ");
        String account= scanner.nextLine();

        System.out.print("Your initial balance is: ");
        double initalBalance= scanner.nextDouble();

        SavingsAccount_AM account1 = new SavingsAccount_AM(account, initalBalance);

        System.out.print("Please enter your deposit amount: ");
        double userDeposit = scanner.nextDouble();
        account1.deposit(userDeposit);
        System.out.println("Current Balance: " + "$"+account1.getBalance());

        System.out.println("\nRun 2");
        System.out.print("Please enter your withdrawal amount: ");
        double userWithdraw = scanner.nextDouble();
        account1.withdraw(userWithdraw);
        System.out.println("Current Balance: " + "$"+account1.getBalance());

        System.out.println("\nRun 3");
        System.out.print("Please enter your withdrawal amount: ");
        double userWithdraw2 = scanner.nextDouble();
        account1.withdraw(userWithdraw2);
        System.out.println("Current Balance: " + "$"+account1.getBalance());

        scanner.close();

    }

}