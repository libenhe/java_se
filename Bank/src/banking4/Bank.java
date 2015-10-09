package banking4;

class Bank {
	private int numberOfCustomer;
	private Customer[] customer;
	
	public Bank() {
		customer = new Customer[5];
	}
	
	public void addCustomer(String firstName, String lastName) {
		
		Customer cust = new Customer(firstName, lastName);
		customer[numberOfCustomer] = cust;
		numberOfCustomer++;
	}
	
	public int getNumOfCustomers(){
		return this.numberOfCustomer;
	}
	
	public Customer getCustomer(int index){
		return customers[index];
	}
	
}