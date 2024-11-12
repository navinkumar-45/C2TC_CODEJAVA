package com.tns.ifet.dayfoure.interfaces.implementinginterface;

public class BankApplication {
	public static void main(String[] args) {
	     Bank bank = new BankImpl();
	     Account account = new Account(123456, "Mihir", 155000, bank);
	     account.deposit(2000);
	     System.out.println(account);
	     account.withdraw(10000);
	     System.out.println(account);
	 }
}