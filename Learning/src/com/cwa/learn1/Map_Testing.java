package com.cwa.learn1;

import java.util.HashMap;
import java.util.Map;

public class Map_Testing {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Animesh");
		map.put(2, "Animesh1");
		map.put(3, "Animesh3");
		
		//using containsKey function
		if(map.containsKey(2)) {
			System.out.println("Animesh is beautiful?");
		}
		
		//Using get function
		System.out.println(map.get(3));
	}
}
