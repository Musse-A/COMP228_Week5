package com.am;

public class BankAccount_AM {
    private final String accountNumber;
    protected double balance;

    public BankAccount_AM(String accountNumber, double balance){
        if (accountNumber == null || accountNumber.isEmpty()){
            throw new IllegalArgumentException("Entered account information is invalid!");
        }
        if (balance <0){
            throw new IllegalArgumentException("Balance is invalid, it can't be less than 0!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount){

        if (depositAmount <= 0){
           System.out.println("Deposit is invalid, it can't be less than or 0!");
           return;
        }
        this.balance = this.balance + depositAmount;


    }

    public void withdraw(double withdrawAmount){

        if (withdrawAmount <0){
            System.out.println("Withdrawal is invalid, it can't be less than 0!");
            return;
        }else if (withdrawAmount > balance){
            System.out.println("The withdrawal amount is too large, insufficient funds!");
        }

        this.balance = this.balance - withdrawAmount;

    }


}