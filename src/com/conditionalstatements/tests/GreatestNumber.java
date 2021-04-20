package com.conditionalstatements.tests;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int firstNumber = in.nextInt();
		
		System.out.println();
		
		System.out.print("Enter second number : ");
		int secondNumber = in.nextInt();
		
		System.out.println();
		
		System.out.print("Enter third number : ");
		int thirdNumber = in.nextInt();
		
		System.out.println();
		
		if(firstNumber>secondNumber && firstNumber>thirdNumber) {
			System.out.println("The Greatest Number is :" +firstNumber);
		}else if (secondNumber>thirdNumber && secondNumber>firstNumber) {
			System.out.println("The Greatest Number is :"+secondNumber);
		}else {
			System.out.println("The Greatest Number is :"+thirdNumber);
		}
		
	}

}
