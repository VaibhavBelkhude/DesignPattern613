package com.nt.entity;

public class Printer {

	//create private variable
	private static Printer INSTANCE;
	
//create private constructor
	private Printer(){
		System.out.println("Private:Constructor");
		
	}
	
	//create static method
	public static Printer getInstance() {
		if(INSTANCE==null)
			INSTANCE=new Printer();
		return INSTANCE;
	}
	
	//CREATE LOGIC
	public void printer(String msg) {
		System.out.println(msg);
	}
}
