package com.nt.entity;

public class Printer {

	//create private variable
	//private static Printer INSTANCE =new Printer();
	private static Printer INSTANCE;
//create private constructor
	private Printer(){
		System.out.println("Private: 0-Param-Constructor");
		
	}
	//create static method
		public static Printer getInstance() {
			if(INSTANCE==null)
				INSTANCE=new Printer();
			return INSTANCE;
		}
	
/*	//create static method
	public static Printer getInstance() {
		return INSTANCE;
	}*/
	
	//CREATE LOGIC
	public void printer(String msg) {
		System.out.println(msg);
	}
}
