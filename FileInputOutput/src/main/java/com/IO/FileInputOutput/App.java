package com.IO.FileInputOutput;

import java.io.File;

public class App 
{
    public static void main( String[] args )
    {
//        File f = new File("d:/file");
//        if(f.mkdir()) {
//        	 System.out.println("Directory created");
//        }
//        else {
//        	System.out.println("Directory could not be created");
//        }
    	
//    	to make file in directory(folder)
    	try {
    	File f = new File("d:/file/one.txt");
    	if(f.createNewFile()){
       	 System.out.println("File created");
       }
       else {
       	System.out.println("File could not be created");
       }
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
