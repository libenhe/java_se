package banking5;
/**
 * 
 * @author Li Benhe
 *
 */
public class Account {

	protected double balance;

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
	 * @param amt
	 *            : 存款的钱数
	 */
	public boolean deposit(double amt) {
		balance += amt;
		return true;
	}
	
	/**
	 * 取钱方法
	 * 
	 * @param amt
	 *            : 取款的钱数
	 */
	public boolean withdraw(double amt) {
		if (amt <= balance) {
			balance -= amt;
			return true;
		} else {
			return false;
		}
	}
}
