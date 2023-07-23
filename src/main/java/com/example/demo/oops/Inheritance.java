package com.example.demo.oops;

public class Inheritance extends MyParent {
	String myName;
	
	public static void main(String[] args) {
		
		Inheritance inheritance =new Inheritance();
		inheritance.myName="Bikash";
		inheritance.display();
		System.out.println("my father name is "+inheritance.name +"my name is"+inheritance.myName);
		
	}

}
class MyParent{
	String name="Banchhanidhi Mohanty";
	
	void display() {
		System.out.println(name);
	}
}
