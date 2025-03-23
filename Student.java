package sdmcet.cse.oop.student;

import sdmcet.cse.oop.person.*;


public class Student extends Person {
	String USN;
	String department;
	char division;

	Student(String fName, String lName, long mobile, String USN, String department, char division) {
		super(fName, lName, mobile);
		this.USN = USN;
		this.department = department;
		this.division = division;
	}

	void display() {
		super.display();
		System.out.println("USN: " + USN);
		System.out.println("Department: " + department);
		System.out.println("Division: " + division);
	}
}
