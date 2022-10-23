package com.training;

import java.io.IOException;
class F extends Thread
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
class  E extends Thread
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
class D extends Thread
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


public class threads {

	public static void main(String[] args) throws IOException {
	F x=new F();
	E y=new E();
	D z=new D();
	
	System.out.println("FThread is priority is :"+ x.getPriority());
	System.out.println("E Thread is priority is :"+ y.getPriority());
	System.out.println("D Thread is priority is :"+ z.getPriority());
	
	
	System.out.println(Thread.MAX_PRIORITY);
	System.out.println( Thread .MIN_PRIORITY);
	System.out.println( Thread.NORM_PRIORITY);
	
	x.start();
	y.start();
	z.start();
	
}
}



	