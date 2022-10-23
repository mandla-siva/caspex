package com.training;

public class Thread1 extends Thread {
	public void run()
	{
		System.out.println("run");
	}

	public static void main(String[] args) {
//		System.out.println("main");
		Thread1 k=new Thread1();
		k.start();
		k.start();
	}
}
