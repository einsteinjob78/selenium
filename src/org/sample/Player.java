package org.sample;

public class Player {
	public static void main(String[] args) {
		System.out.println("My Sample Project");
		byte a=10;
		System.out.println("Byte = "+a);
		long b=123456l;
		System.out.println("long = "+b);
		int c=2;
		System.out.println("int = "+c);
		short d=30560;
		System.out.println("short = "+d);
		float e=12.23f;
		System.out.println("float = "+e);
		double f=12345;
		System.out.println("double = "+f);
		boolean g=false;
		System.out.println("boolean = "+g);
		char h='c';
		System.out.println("char = "+h);
		int memory=System.identityHashCode(d);
		System.out.println(memory);
	
	}

}
