package abstracting;

public class Testemployee {

	public static void main(String[] args) {

		Employee e1 = new Manager();
        e1.work();

		Employee e2 = new Commonemployee();
		e2.work();
	}

}
