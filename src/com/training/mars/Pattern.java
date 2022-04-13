package com.training.mars;

public class Pattern {

	public static void main(String[] args) {
		
	//pattern();	
	secondpattern();

	}
private static void pattern() {
	for(int i=1; i<=3; i++) {
	for(int j=1; j<=i; j++) {
		System.out.print(j);
	}
	System.out.println();
   }
}
private static void secondpattern() {
	int k=1;
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=i;j++)
		{
		System.out.print(k);
		k++;
		}
		System.out.println();
	}
	}
}

