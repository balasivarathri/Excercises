package com.excercises.tests;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your firstname");
		String fname = input.next();
		System.out.print("Enter your lastname");
		String lname = input.next();
		System.out.println("Hello your fullname is :" + fname +" "+ lname);
			
	}

}
