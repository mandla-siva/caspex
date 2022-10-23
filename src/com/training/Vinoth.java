package com.training;
class printer 
{
	public void table(int n)
	{
		for(int i=1;i<=10;i++)
		{
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
}
class computer extends Thread
{
	printer p1=null;
	public computer(printer p1)
	{
		this.p1=p1;
	}
	public void run()
	{
	p1.table(5);
	}
	
}
class computer1 extends Thread
{
	printer p2=null;
	public computer1(printer p2)
	{
		this.p2=p2;
	}
	public void run()
	{
		p2.table(1000);
	}
}
public class Vinoth {
	public static void main(String[] args) {
		printer p=new printer();
		computer c1=new computer(p);
		computer1 c2=new computer1(p);
		c1.start();
		c2.start();

	}

}
