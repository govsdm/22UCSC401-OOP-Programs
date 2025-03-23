package sdmcet.cse.oop.employee;

import sdmcet.cse.oop.person.*;

public class Employee extends Person {
	String empCode;
	String department;
	int salary;

	Employee(String fName, String lName, long mobile, String empCode, String department, int salary) {
		super(fName, lName, mobile);
		this.empCode = empCode;
		this.department = department;
		this.salary = salary;
	}

	void display() {
		super.display();
		System.out.println("Employee Code: " + empCode);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + salary);
	}
}
