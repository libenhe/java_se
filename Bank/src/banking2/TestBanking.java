package banking2;

import banking2.*;

public class TestBanking {

	public static void main(String[] args) {

		// Account account;// 方法一

		System.out.println("Creating the customer Jane Smith.");
		Customer customer = new Customer("Jane", "Simth");

		System.out.println("Creating her account with a 500.00 balance.");
		// account = new Account(500);//方法一
		// customer.setAccount(account);//方法一

		customer.setAccount(new Account(500));// 方法二

		System.out.println("Withdraw 150.00");
		customer.getAccount().withdraw(150.00);

		System.out.println("Deposit 22.50");
		customer.getAccount().deposit(22.50);

		System.out.println("Withdraw 47.62");
		customer.getAccount().withdraw(47.62);

		System.out.println("Customer [" + customer.getLastName() + ", "
				+ customer.getFirstName() + "] has a balance of "
				+ customer.getAccount().getBalance());
	}
}
