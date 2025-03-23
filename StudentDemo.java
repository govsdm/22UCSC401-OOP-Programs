package sdmcet.cse.oop.demo;

import sdmcet.cse.oop.employee.Employee;
import sdmcet.cse.oop.person.Person;
import sdmcet.cse.oop.student.Student;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p;
		p = new Person("Govind", "N", 123456789);
		p.display();
		System.out.println("-----------------");
		p = new Employee("Govind", "N", 123456789, "CSDT82", "CSE", 20000);
		p.display();
		System.out.println("-----------------");
		p = new Student("Govind", "N", 123456789, "2SD23CS000", "CSE", 'B');
		p.display();
		System.out.println("-----------------");
	}

}
