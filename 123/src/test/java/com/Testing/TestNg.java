package com.Testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class TestNg {
	
	
	
	@BeforeMethod (groups = "two")

	public void bri() {
		
		System.out.println("T-4");
	}
	@Test (groups = "one")
	
	public void one() {
		
		System.out.println("T-7");
	}
	

@Test (groups = "one")
	
	public void gtrr() {
		
		System.out.println("T-3");
	}
	
@Test (groups = "one")

public void gtrvfdfgr() {
	
	System.out.println("T-6");
}
	@AfterMethod (groups = "one")
	 
	public void vri() {
		System.out.println("T-13");
	}
	
	
	@Test (groups = "two")
	public void gri() {
		System.out.println("t-54");
		 
		@Test (groups = "two")
		public void grsi() {
			System.out.println("t-543");
		
		

	}
}


