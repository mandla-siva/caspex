package com.training;

public class Welcome extends Thread{

	public void run()
	{
	Thread t=Thread.currentThread();
	 String name=t.getName();
	 System.out.println("order :" +name);
	}
	

	public static void main(String[] args) 
	{
		Welcome ob=new Welcome();
		Welcome ob1=new Welcome();
		Welcome ob2=new Welcome();
		Welcome ob3=new Welcome();
		
		ob.setName("one");
		ob1.setName("two");
		ob2.setName("three");
		ob3.setName("four");
		
		ob.start();
		ob1.start();
		ob2.start();
		ob3.start();
		
		
	}

}
