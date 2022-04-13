package com.training.mars;

import java.util.Scanner;

public class GuessMyLuckyNumber {

	public static void main(String[] args) {
		int luckyNumber = 5;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Guess my lucky number between 1-10");
		int guess = scanner.nextInt();
		int count =1;
		
		while(luckyNumber != guess) {
			
		if(guess>luckyNumber)
		{
			System.out.println("Too high!! Number of guesses:"+count+" Guess again!!");
			guess= scanner.nextInt();
		}
		else{
		{
			System.out.println("Too low!! Number of guesses:"+ count +" Guess again!!");
			guess = scanner.nextInt();
		}
		}
		count++;
		}
	System.out.println("You guessed it right in " +count+ " attempts");
	}
}
			
		

		

		

	


