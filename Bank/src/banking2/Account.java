package banking2;

public class Account {

	private double balance;

	public Account() {
	}

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	/**
	 * 存钱方法
	 * 
	 * @param amt  : 存款的钱数
	 */
	public void deposit(double amt) {
		this.balance += amt;
	}

	/**
	 * 取钱方法
	 * 
	 * @param amt : 取款的钱数
	 */
	public void withdraw(double amt) {
		this.balance -= amt;
	}

}
