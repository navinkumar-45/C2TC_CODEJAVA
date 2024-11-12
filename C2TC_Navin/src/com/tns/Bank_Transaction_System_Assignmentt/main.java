package com.tns.Bank_Transaction_System_Assignmentt;

public class main {
    public static void main(String[] args) {

        System.out.println("Total Bank Accounts: " + Bank.getTotalAccounts());

        SavingsAccount savingsAccount = new SavingsAccount(1000.0);
        savingsAccount.displayBalance();

        CheckingAccount checkingAccount = new CheckingAccount(1500.0);
        checkingAccount.displayBalance();

        System.out.println("Total Bank Accounts: " + Bank.getTotalAccounts());

        Transaction transaction = new Transaction();

        transaction.performTransaction(savingsAccount, 200.0, true);  // Deposit
        transaction.performTransaction(savingsAccount, 100.0, false); // Withdrawal

        transaction.performTransaction(checkingAccount, 300.0, true);  // Deposit
        transaction.performTransaction(checkingAccount, 500.0, false); // Withdrawal
    }
}

