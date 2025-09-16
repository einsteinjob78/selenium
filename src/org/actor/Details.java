package org.actor;

public class Details extends Ajith {
public void name() {
	System.out.println("Ajith Kumar");
}
public void dob() {
	System.out.println("Born on 1st May 1971");
}
public static void main(String[] args) {
	Details m = new Details();
	m.movie();
	m.status();
	m.name();
	m.dob();
	
	
}
}
