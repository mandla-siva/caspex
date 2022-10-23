package com.training;

public class Siva1 extends Thread {
	public void run()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		}
	}
	

	public static void main(String[] args) {
                                       
		Siva1 obj=new Siva1();
		obj.start();

	}

}
