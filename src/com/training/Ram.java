package com.training;

import java.io.File;
import java.io.IOException;
class A extends Thread
{ int i;
public void run()
{
	for(i=1;i<=10;i++)
	{
		try
		{
			System.out.println("a ="+ i);
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
}
class B extends Thread
{
	int i;
	public void run()
	{
		for(i=1;i<=10;i++)
	
		{
			try
			{
				System.out.println("B="+i);
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		}
}
class C extends Thread
{
	int i;
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			try
			{
				System.out.println("C= "+ i);
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
			
		
	}
}


public class Ram {

	public static void main(String[] args) throws IOException {
	A x=new A();
	B y=new B();
	C z=new C();
	
	x.start();
	try
	{
		x.join();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	y.start();
	z.start();
}
}

