package com.nt.test;

import com.nt.entity.TicketBookingServlet;

public class Singleton_MultiThreadEvnr {
	
public static void main(String[] args) {
	
TicketBookingServlet servlet=new TicketBookingServlet();

Thread t1=new Thread(servlet);
Thread t2=new Thread(servlet);
Thread t3=new Thread(servlet);
t1.start();

//System.err.println("t1");
t2.start();
//System.err.println("t2");
t3.start();
//System.err.println("t3");
  }//method
}//class