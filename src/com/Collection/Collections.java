package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		List<Object> l = new ArrayList<>();
		l.add("Einstein");
		l.add(60);
		l.add(54.25);
		l.add("Job");
		l.add(50);
		System.out.println(l);
		
		for (Object list : l) {
			System.out.println(list);
			
		}
       
		int size = l.size();
		System.out.println("----------------");
		System.out.println(size);
		
		l.remove(3);
		System.out.println("------------------");
		System.out.println(l);
		
		boolean contains = l.contains(60);
		System.out.println("------------------");
		System.out.println(contains);
		
		int indexof = l.indexOf(54.25);
		System.out.println("------------------");
		System.out.println(indexof);
		
		l.set(3, "job");
		System.out.println("------------------");
		System.out.println(l);
		
		l.get(3);
		System.out.println("------------------");
		System.out.println(l);
		
//		l.clear();
//		System.out.println("------------------");
//		System.out.println(l);
		
		
		List<Object> l1 = new ArrayList<>();
		l1.add("Manoj");
		l1.add(60);
		l1.add(54.25);
		l1.add("Java");
		l1.add(50);
		
		l.addAll(l1);
		System.out.println("------------------");
		System.out.println(l);
		
		
		
//		l.removeAll(l1);
//		System.out.println("------------------");
//		System.out.println(l);
//		
	}

}
