package com.tns.Bank_Transaction_System_Assignmentt;

public class SavingsAccount extends Account{
	private static final double MINIMUM_BALANCE = 500.0;
	
	public SavingsAccount(double initialBalance){
		super(initialBalance);
        Bank.incrementAccounts();
	}
	@Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " in Savings Account.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Savings Account.");
        } else {
            System.out.println("Withdrawal failed: Minimum balance must be $" + MINIMUM_BALANCE);
        }
    }
    @Override
    public double getBalance() {
        return balance;
    }
}
