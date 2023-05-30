package com.Java8.Date_Time_Demo;

import java.util.Locale;

public class Locale_Class {

	public static void main(String[] args) {
		
		Locale l1 = Locale.getDefault();
		System.out.println("Default locale:" + l1);
		System.out.println("Language, country, variant, Name");
		System.out.println(" ");
		System.out.println(l1.getLanguage() + "," + l1.getCountry() + "," + l1.getVariant() + "," + l1.getDisplayName());  

		//predefined locale
		l1=Locale.CANADA_FRENCH;
		System.out.println("Predifined locale");
		System.out.println(l1.getLanguage() + "," + l1.getCountry() + "," + l1.getVariant() + "," + l1.getDisplayName());  
		
		 // define a new locale
	      l1 = new Locale("en", "CN");
	      System.out.println("User defined locale -Locale(\"en\",\"CN\"):");
	      System.out.println("   "+l1.getLanguage()+", "+l1.getCountry()+", "
	         +", "+l1.getVariant()+", "+l1.getDisplayName());
	      
	      // define another new locale
	      l1 = new Locale("ll", "CC");
	      System.out.println("User defined locale -Locale(\"ll\",\"CC\"):");
	      System.out.println("   "+l1.getLanguage()+", "+l1.getCountry()+", "
	         +", "+l1.getVariant()+", "+l1.getDisplayName());
	      // get the supported locales
	      Locale[] s = Locale.getAvailableLocales();
	      System.out.println("Supported locales: ");
	      for (int i=0; i<s.length; i++) {
	         System.out.println("   "+s[i].getLanguage()+", "
	            +s[i].getCountry()+", "+s[i].getVariant()+", "
	            +s[i].getDisplayName());

	}

}
}
