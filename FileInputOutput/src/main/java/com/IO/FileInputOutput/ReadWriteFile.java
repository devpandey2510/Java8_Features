package com.IO.FileInputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteFile {
  
	public static void main(String[] args) {
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
		File f1 = new File("d:/file/one.txt");//File is an inbuilt class
		File f2 = new File("d:/file/two.txt");//File in which are writing
		
//		To read data
		 in = new FileInputStream(f1);//FileInputStream is in built class in package of IO
		 out = new FileOutputStream(f2);//to write in file
		
		int c=0;
		while((c=in.read())!=-1)//read method will read ASCII values from class
			{
			out.write(c);
		}
		System.out.println("Kaam ho gaiyl");
	       }
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
			out.close();
			in.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
