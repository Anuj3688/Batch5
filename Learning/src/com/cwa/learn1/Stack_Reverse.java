package com.cwa.learn1;

import java.util.Stack;

public class Stack_Reverse {
	public static void main(String[] args) {
		Stack<String> a = new Stack<>();
		String a1 = "Just try a new one";
		String[] te = a1.split(" ");
		for(int i=0 ; i<te.length ; i++) {
			a.push(te[i]);
		}
		String ans = "";
		while(!a.isEmpty()) {
			ans += a.pop()+" ";
		}
		System.out.println(ans);
	}
}
