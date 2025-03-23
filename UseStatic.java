package com.sdmcet.cse.oop.staticdemo;

class UseStatic {
	static int a = 3;
	static int b;

	static void method(int x) {
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	static {
		System.out.println("Static block initialized.");
		b = a * 4;
	}

	public static void main(String args[]) {
		method(42);
	}
}
