package com.training.mars;

import java.util.Scanner;


public class BasicsDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter age: ");
		int age = scanner.nextInt();
		
		
		if (age < 18) {
			System.out.println("Not eligible to vote");
		}
		else {
			System.out.println("Eligible to vote!");
		}
		scanner.close();
	}

	
}
