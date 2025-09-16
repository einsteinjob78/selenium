package com.Collection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Collections {

	public static void main(String[] args) {
		Set <Integer> l = new TreeSet<>();  
		l.add(1000);
		l.add(60);
		l.add(54);
		l.add(4785);
		l.add(10);
        System.out.println(l);
        
        for (Integer set : l) {
        	System.out.println(set);
			
		}
        
        int size  = l.size();
        System.out.println("----------------");
		System.out.println(size);
		
		boolean contains = l.contains(60);
		System.out.println("----------------");
		System.out.println(contains);
		
		Set <Integer> l1 = new LinkedHashSet<>();  
		l1.add(1000);
		l1.add(600);
		l1.add(540);
		l1.add(478);
		l1.add(104);
		System.out.println(l);
		
		l.addAll(l1);
		System.out.println("------------------");
		System.out.println(l);
		
//		l.remove(100);
//		System.out.println("------------------");
//		System.out.println(l);
//		
//		l.clear();
//		System.out.println("------------------");
//		System.out.println(l);
		
		l1.retainAll(l);
		System.out.println("------------------");
		System.out.println(l);
		
		l.removeAll(l);
		System.out.println("------------------");
		System.out.println(l);
		
		
	}

}
