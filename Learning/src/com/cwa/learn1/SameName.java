package com.cwa.learn1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SameName {
	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		a.add("Anuj");
		a.add("Rahul");
		a.add("Mouniskkh");
		a.add("Rajujjj");
		a.add("khadakjgftr");
		a.add("Animehhsh");
		a.add("Anuj");
		for (int i = 0; i < a.size(); i++) {
			String a1 = a.get(i);
			String ans = "";
			Set<Character> a2= new HashSet<>();
			for(int j=0 ; j<a1.length() ; j++) {
				if(a2.add(a1.charAt(j))==true) {
					ans += a1.charAt(j) ;
				}	
			}
			a.set(i, ans);
		}
		
		System.out.println(a);
	}
}
