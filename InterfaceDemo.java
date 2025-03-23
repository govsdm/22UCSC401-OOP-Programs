package com.sdmcet.cse.oop.intrface;

interface Shapes {
	double area();
}

class Circle implements Shapes {
	int radius;
	final double PI = 3.142;

	Circle(int radius) {
		this.radius = radius;
	}

	double area() {
		return PI * radius * radius;
	}
}

class Rectangle extends Shapes {
	int length;
	int breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	double area() {
		return length * breadth;
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes c = new Circle(4);
		System.out.println("Area: " + c.area());
		Shapes r = new Rectangle(4, 6);
		System.out.println("Area: " + r.area());
	}

}
