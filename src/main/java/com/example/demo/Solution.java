//package com.example.demo;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map.Entry;
//import java.util.Set;
//
//import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties.Restclient;
//import org.springframework.web.client.RestTemplate;
//
//class Solution{
//	    public static int appleSequence(int n, int m, String arr){
//	    	
//	    	//RestTemplate rest;
//	        //code here
//	        
//	        // an array contains only A and O
//	        // m is a magic spell ok 
//	        // if i apply 1 spell on orange then
//	        // it will become orange - apple right
//	        
//	    	//rest1=rest.execute(null, null, null, null, null);
//	        
//	        char [] arr1=arr.toCharArray();
//	        HashMap<Character , Integer> hMap= new HashMap<>();
//	        
//	        for(char c : arr1) {
//				if(hMap.containsKey(c)) {
//					hMap.put(c, hMap.get(c)+1);
//				}
//				else {
//					hMap.put(c, 1);
//				}
//			}
//			
////			for (Entry<Character, Integer> entry : hMap.entrySet()) {
////				
////				if(entry.getKey() == 'A'){
////				   Integer Avalue= entry.getValue();
////				   return Avalue+m;
////				}
////				
////			}
//	        
//	        Set<Entry<Character, Integer>> entrySet = hMap.entrySet();
//	        
//	        Iterator<Entry<Character, Integer>> iterator = entrySet.iterator();
//	        while(iterator.hasNext()) {
//	        	Entry<Character, Integer> next = iterator.next();
//	        	if(next.getKey()=='A') {
//	        		Integer value = next.getValue();
//	        		return value+m;
//	        	}
//	        }
//	        return 0;
//	    }
//	    
//	    public static int maximizeAppleTrees(int N, int M, String arr) {
//	        long appleCount = arr.chars().filter(c -> c == 'A').count();
//	        return (int) Arrays.stream(arr.split(""))
//	                .mapToLong(c -> c.equals("O") ? appleCount + 1 : appleCount)
//	                .max()
//	                .orElse(appleCount);
//	    }
//	    public static void main(String[] args) {
//	    	
//	    	int n=5;
//	    	int m=1 ;
//	    	String arr = "AOOAO";
//
//	    	int appleSequence = maximizeAppleTrees(n, m,arr);
//	    	System.out.println(appleSequence);
//	    
//	    	
//		}
//	}
//
//
//	//{ Driver Code Starts.
//
//	// } Driver Code Ends
//	// } Driver Code Ends
