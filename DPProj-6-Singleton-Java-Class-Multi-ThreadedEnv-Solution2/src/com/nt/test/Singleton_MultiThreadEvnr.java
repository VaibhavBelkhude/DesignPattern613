package com.nt.test;

import com.nt.entity.TicketBookingServlet;

public class Singleton_MultiThreadEvnr {
	
public static void main(String[] args) throws Exception {
	
TicketBookingServlet servlet=new TicketBookingServlet();

Thread t1=new Thread(servlet);
Thread t2=new Thread(servlet);
Thread t3=new Thread(servlet);
long start=System.currentTimeMillis();
Thread.sleep(2000);
t1.start();
t2.start();
t3.start();
long end=System.currentTimeMillis();
Thread.sleep(2000);
System.err.println("Time:"+(end-start));
  }//method
}//class