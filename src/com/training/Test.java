package com.training;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\siva.text");

		FileWriter fb=new FileWriter(f);
		BufferedWriter g=new BufferedWriter(fb);
		g.write("silicon service");
		g.close();
			

		System.out.print("sucess");


	}

}






