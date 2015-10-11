package banking5;
/**
 * 
 * @author Li Benhe
 *
 */
public class CheckingAccount extends Account {

	private double overdraftProtection;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(double balance) {
		super(balance);
	}

	public CheckingAccount(double balance, double overdraftProtection) {
		super(balance);
		this.overdraftProtection = overdraftProtection;
	}
	
	
	/**
	 * 重写父类的withdraw方法，增加透支金额项
	 */
	public boolean withdraw(double amt) {
		if (amt <= super.balance) {
			balance -= amt;
		} else  {
			if (this.overdraftProtection >= (amt - super.balance)) {
				this.overdraftProtection -= (amt - super.balance);
				super.balance = 0;
			}else {
				return false;
			}
		}
		return true;	
	}
}
