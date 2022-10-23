package com.training;
class dog
{
	String color="white";
	
	
}
class animal extends dog
{
	String color="red";
	void print()
	{
		System.out.println(color);
		System.out.println(super.color);
		
	}
	
}
public class Sivssuper {

	public static void main(String[] args) {
		animal k=new animal();
		k.print();
		

	}

}
