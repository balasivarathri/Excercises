package com.conditionalstatements.tests;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		//Write a Java program to get a number from the user and print whether it is positive or negative.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		if(number>0) {
			System.out.println(number + " is Positive Number");
		}else if(number<0)
		{
			System.out.println(number + " is Nagative Number");
		}else {
			System.out.println("Entered Number is zero");
		}
		
		
	}

}
