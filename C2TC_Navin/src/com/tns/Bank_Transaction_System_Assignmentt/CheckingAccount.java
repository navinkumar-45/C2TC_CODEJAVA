package com.tns.Bank_Transaction_System_Assignmentt;

public class CheckingAccount extends Account {

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
        Bank.incrementAccounts(); // Increment total accounts
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " in Checking Account.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Checking Account.");
        } else {
            System.out.println("Withdrawal failed: Insufficient funds.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

