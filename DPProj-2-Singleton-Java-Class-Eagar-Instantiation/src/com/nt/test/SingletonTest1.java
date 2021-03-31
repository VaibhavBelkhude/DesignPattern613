package com.nt.test;

import com.nt.entity.Printer;

public class SingletonTest1 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.nt.entity.Printer");
		Printer p1=Printer.getInstance();
		Printer p2=Printer.getInstance();
		System.out.println("===============================");
		System.out.println(p1.hashCode()+"|***|"+p1.hashCode());
		System.out.println("================================");
		System.out.println("p1==p2:"+(p1==p2));
	}

}
