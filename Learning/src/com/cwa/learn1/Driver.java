package com.cwa.learn1;

import java.util.*;

public class Driver {
	static{
		System.out.println("hey I am static");
	}
	public static void main(String[] args) {
		///
		Learn l1 = new Learn();
		System.out.println(l1.name);
		System.out.println(l1.rollno);
		int[] a = new int[15];
		a[0]=0;
		System.out.println(a[0]);
		
		List link =  new LinkedList();
		link.add(12);
		link.add(23);
		System.out.println(link);
		
	}
	
	public static void check() {
		
	}
}
