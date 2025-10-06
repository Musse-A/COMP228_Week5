package com.am;

public class SavingsAccount_AM extends BankAccount_AM{

    public SavingsAccount_AM(String accountNumber, double balance){
        super(accountNumber,balance);
    }

    @Override
    public void withdraw(double withdrawAmount){
        if (withdrawAmount < 0){
            System.out.println("Withdrawn amount can't be 0!");
            return;
        }
        if (balance - withdrawAmount < 50){
            System.out.println("Your account balance can't be lower than $50, withdrawn amount is denied");
            return;
        }
        balance = balance - withdrawAmount;
    }
}
