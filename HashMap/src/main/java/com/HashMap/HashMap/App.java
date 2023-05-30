package com.HashMap.HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

 class HashMapIterationOrder
{

    public static void main( String[] args )
    {        
        System.out.println( "Using plain hash map using linked lists in java 7:" );
        HashMap<String, String> stringMap = new HashMap<String, String>();

        for( int i = 0; i < 100; ++i )
        {
            stringMap.put( "index_" + i, String.valueOf( i ) );
        }

        for( String string : stringMap.values() )
        {
            System.out.println(string);
        }

        System.out.println( "using LinkedHashMap with linked lists:" );
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();

        for( int i = 0; i < 100; ++i )
        {
            linkedHashMap.put( "index_" + i, String.valueOf( i ) );
        }

        for( String string : linkedHashMap.values() )
        {
            System.out.println(string);
        }

    }
}

public class App 
{
    public static void main( String[] args )
    {
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
        ht.put(100, "Rakesh");
        ht.put(101, "Dev");
        ht.put(101, "Shubham");
        ht.put(102, "Rajesh Upadhyay");
        System.out.println("Hashtable content");
        for(Entry m: ht.entrySet()) {
        	System.out.println(m.getKey()+" "+m.getValue());
        }
        
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(100, "Rakesh");
        hm.put(101, "Dev");
        hm.put(101, "Shubham");
        hm.put(102, "Rajesh Upadhyay");
        hm.put(103, "Ravi Upadhyay");
        System.out.println("HashMap content");
        for(Entry m: hm.entrySet()) {
        	System.out.println(m.getKey()+" "+ m.getValue());
        }
    }
}
