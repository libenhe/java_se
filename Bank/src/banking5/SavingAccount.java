package banking5;
/**
 * 
 * @author Li Benhe
 *
 */
public class SavingAccount extends Account {

	protected double interestRate;

	public SavingAccount() {

	}

	public SavingAccount(double intersetRate, double balance) {
		super(balance);
		this.interestRate = intersetRate;
	}

}
