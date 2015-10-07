package banking1;

public class Account {

	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	/**
	 * 存钱的方法
	 * 
	 * @param amt : 存钱的次数
	 */
	public void deposit(double amt) {
		this.balance += amt;
	}

	/**
	 * 取钱的方法
	 * 
	 * @param amt : 取钱的次数
	 */
	public void withdraw(double amt) {
		this.balance -= amt;
	}

}
