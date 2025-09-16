package com.Collection;

import java.io.ObjectInputStream.GetField;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map_Collections {

	public static void main(String[] args) {
		Map <Integer , String> l = new TreeMap<>();  
		l.put(1 , "Einstein");
		l.put(2 , "Anish");
		l.put(3 , "Shiva");
		l.put(4 , "Senthil");
		l.put(5 , "Shiva");
        System.out.println(l);
       
        int size  = l.size();
        System.out.println("----------------");
		System.out.println(size);

		String String = l.get(3);
		System.out.println("----------------");
		System.out.println(String);
		
		Collection<String> values = l.values();
		System.out.println("----------------");
		System.out.println(values);
		
		boolean containskey = l.containsKey(3);
		System.out.println("----------------");
		System.out.println(containskey);
		
		boolean containsvalues = l.containsValue("Job");
		System.out.println("----------------");
		System.out.println(containsvalues);
		
		Set<Entry<Integer , String>> entrySet = l.entrySet();
		System.out.println("----------------");
		System.out.println(entrySet);
		
		
		
		
		
		
	}

}
;