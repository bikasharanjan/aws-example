//package com.example.demo;
//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map.Entry;
//
//public class FrequencyOfChar {
//	
//	
//	static Character charCount(String input) {
//		
//		HashMap< Character, Integer> hMap = new HashMap<>();
//		
//		char[] charArray = input.toCharArray();
//		
//		for(char c : charArray) {
//			if(hMap.containsKey(c)) {
//				hMap.put(c, hMap.get(c)+1);
//			}
//			else {
//				hMap.put(c, 1);
//			}
//		}
//		
//		for (Entry<Character, Integer> entry : hMap.entrySet()) {
//			Character key = entry.getKey();
//			Integer value = entry.getValue();
//			if(key != ' ' && value == 1 ) {
//				System.out.println(entry.getKey()+ " : "+entry.getValue() );
//			}
//		}
//		
//		
//		for (Entry<Character, Integer> entry : hMap.entrySet()) {
//			
//			if(entry.getValue()==1) {
//				return entry.getKey();
//			}
//			
//		}
//		return null;
//	}
//	
//	public static void main(String[] args) {
//		
//		String s = "Bikash Ranjan Mohanty";
//		Character charCount = charCount(s);
//		System.out.println(charCount);
//		
//	}
//
//}
