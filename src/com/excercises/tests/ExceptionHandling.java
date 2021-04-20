package com.excercises.tests;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		ExceptionHandling obj = new ExceptionHandling();
		obj.search(21, "bala");
		
	}
	public void search(int age,String sname) {
		String s = sname; 
		int a = age; 
		System.out.println("My name is:" +s+ "and age is :"+a);
	}
	/*
	 * public void search(int age,String sname) { sname = "bala"; age = 26;
	 * System.out.println("name is:" +sname+ "and age is :"+age); }
	 */
}
