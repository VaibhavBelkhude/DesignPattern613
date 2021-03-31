package com.nt.entity;

public class Printer {
//Best Solution to solved Multi-Threaded Env
	//create private variable
	//private static volatile Printer INSTANCE;
   private static Printer INSTANCE =new Printer();//egar intialization
	
//create private constructor
	private Printer(){
		System.out.println("Private: 0-Param-Constructor");
		
	}
	/*
	//create static method
	public static Printer getInstance() {
		if(INSTANCE==null){//1st null check 
			synchronized(Printer.class) {
			if(INSTANCE==null)//2nd null check
				INSTANCE=new Printer();	
			}
		}
				return INSTANCE;
	*/
	/*private static class Inner Printer{
		private static Printer INSTANCE=new Printer();
	}*/
	public static Printer getInstance() {
		return INSTANCE;
	}
	
	/*//CREATE LOGIC
	public void printer(String msg) {
		System.out.println(msg);
	
				
}*/
}
