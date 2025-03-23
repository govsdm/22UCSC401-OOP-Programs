package sdmcet.cse.oop.person;

public class Person {
	protected String fName;
	protected String lName;
	protected long mobile;

	Person(String fName, String lName, long mobile) {
		this.fName = fName;
		this.lName = lName;
		this.mobile = mobile;
	}

	void display() {
		System.out.println("First Name: " + this.fName);
		System.out.println("Last Name: " + this.lName);
		System.out.println("Mobile: " + this.mobile);
	}
}
