package com.cwa.learn1;

public class Learn {
	String name;
	int rollno;
	static int ch =2;
	
	//Static Block
	static {
		System.out.println("Hey! I am Static Block");
	}
	
	
//	Learn() {
//		System.out.println("Non-parameterized constructor call");
//	}
//
//	Learn(String name, int rollno) {
//		System.out.println("Parameterized ");
//		this.name = name;
//		this.rollno = rollno;
//		System.out.println(this);
//	}
}