package abstracting;

abstract class Employee {

	private String name;
	private int id;
	private double salary;

	public abstract void work();

	public String getName() {
		return this.name;
	}

	public void setNmae(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
