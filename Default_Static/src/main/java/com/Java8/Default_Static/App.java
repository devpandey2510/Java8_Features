package com.Java8.Default_Static;

interface X{
	
	static void foo() {
		 System.out.println("I am a static method inside a interface");
	 }
	
	String getStreet();
	String getCity();
	default String getAddress() {
		return getStreet() + " " + getCity();
	}
}

 class Y implements X {
	private String street;
	private String city;
    public Y(String street, String city) {
    	this.street = street;
    	this.city = city;
    }
    
    public String getStreet() {
    	return street;
    }
    
    public String getCity() {
    	return city;
    }
    
}

public class App 
{
    public static void main( String[] args )
    {
    	X.foo();
    	Y a = new Y("Street-2" , "Faridabad");
    	System.out.println(a.getAddress());
    }
}
