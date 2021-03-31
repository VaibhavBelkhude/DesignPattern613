package com.nt.test;

import com.nt.entity.Printer;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		Printer p1=Printer.getInstance();
		//Printer p2=Printer.getInstance();
		System.out.println(p1.hashCode());
		//System.out.println(p1.hashCode()+ " "+"p1.hashCode()");
	}
	}