package com.example.demo.oops;

public class RuntimePolymor {
	
	public static void main(String[] args) {
		String verify="bikash11";
		
		Bank b;
		b=new Sbi();
		System.out.println(b.rateOfInterset()+ ""+b);
		b=new ICICI();
		System.out.println(b.rateOfInterset()+ ""+b);
		b=new Axis();
		System.out.println(b.rateOfInterset() + ""+b);
		
		Bikash impl = new Impl();
		impl.isBikash(verify);
		
	}


}

class Bank{
	float rateOfInterset() {
		return 0;
		
	}
}

class Sbi extends Bank{
	
	float rateOfInterset() {
		return 4.4f;
		
	}
	
}

class ICICI extends Bank{
	
	float rateOfInterset() {
		return 5.3f;
		
	}
	
}

class Axis extends Bank{
	
	float rateOfInterset() {
		return 6.6f;
		
	}
	
}

interface Bikash{
	void notBikash(String name);
	void isBikash(String name);
}

//if the class is abstract no need to add all methods
//else if this class implements a interface then all should be override
 class Impl implements Bikash{

	@Override
	public void isBikash(String name) {
		if(name.equalsIgnoreCase(name)) {
			System.err.println("true");
		}
	}

	@Override
	public void notBikash(String name) {
		if(!name.equalsIgnoreCase(name)) {
			System.err.println("flase");
		}
		
	}


	
}
