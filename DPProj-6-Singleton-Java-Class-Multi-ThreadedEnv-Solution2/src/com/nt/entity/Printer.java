package com.nt.entity;

public class Printer {
//Best Solution to solved Multi-Threaded Env
	
	//2)Synchronized method and 2-Null Check
	//create private variable
	private static Printer INSTANCE;
	//private static  volatile Printer INSTANCE;
	//private static Printer INSTANCE =new Printer();
	
//create private constructor
	private Printer(){
		System.out.println("Private: 0-Param-Constructor");
		
	}
	/*
	//create static method
		public static Printer getInstance() {
			//if(INSTANCE==null){//1st null check 
				synchronized(Printer.class) {
				if(INSTANCE==null)//2nd null check
					INSTANCE=new Printer();	
				//}
			}
					return INSTANCE;
		
		}
	*/
	 //create static method
	
	public static Printer getInstance() {
		if(INSTANCE==null){//1st null check 
			synchronized(Printer.class) {
			if(INSTANCE==null)//2nd null check
				INSTANCE=new Printer();	
			}
		}
				return INSTANCE;
	
	}
	
	//CREATE LOGIC
	public void printer(String msg) {
		System.out.println(msg);
	
				
}
}
