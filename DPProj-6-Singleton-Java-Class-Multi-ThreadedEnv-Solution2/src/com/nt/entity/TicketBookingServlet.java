package com.nt.entity;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		Printer p1=Printer.getInstance();
		Printer p2=Printer.getInstance();
		//System.out.println(p1.hashCode()+ " "+p2.hashCode());
		System.out.println(p1.hashCode());
		System.err.println("===========================");
	//	System.out.println(p1.hashCode());
		//System.err.println("===========================");
	}
	}