package com.training.mars;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		int count, value;

    	//User inputs the array size
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        count = scan.nextInt();

        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++) 
        {
            num[i] = scan.nextInt();
        }
        scan.close();

        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (num[i] > num[j]) 
                {
                    value = num[i];
                    num[i] = num[j];
                    num[j] = value;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < count - 1; i++) 
        {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[count - 1]);
    }

	}
	
	


