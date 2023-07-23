package com.example.demo.oops;

public class Class1 {
	
	int num;
	String name;
	
	void inserData(int n , String s) {
		num=n;
		name=s;
	}
	void display() {
		System.out.println(num + ""+name);
	}
	
	
	public static void main(String[] args) {
		
		Class1 class1=new  Class1();
		class1.inserData(1, "Bikash");
		Class1 class2=new  Class1();
		class2.inserData(2, "Ranjan");
		class1.display();
		class2.display();
		
	}
	
	
}
