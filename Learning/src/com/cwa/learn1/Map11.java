package com.cwa.learn1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map11 {
	public static void main(String[] args) {
		Map<Character,Integer> map1 = new HashMap<>();
		Map<Integer,Character> map2 = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		
		for (int i = 0; i < a.length(); i++) {
			map1.put(a.charAt(i),i );
		}
		for (int i = 0; i < b.length(); i++) {
			map2.put(i,b.charAt(i) );
		}
		
		boolean j = true;
		for (int i = 0; i < b.length(); i++) {
			if(map1.containsKey(map2.get(i))==false)
				j  =false;
		}
		System.out.println(j);
		
		
		
	}
}
