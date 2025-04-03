package com.Abhishek;

import java.util.Scanner;

public class AverageofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// size of array
		int size;
		double average;
		int sum=0;
		
		//size input
		System.out.print("Enter the size of array: ");
		size = scanner.nextInt();

		//array initialization
		int[] arr = new int[size];
		
		System.out.println("Enter your numbers: ");
		
		//array input
		for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
		}
		
		
		
            //Average Function
            for(int avg : arr) {
            	sum +=avg;
            }
            
        
		//Average
        average = sum/size;
        

		System.out.println("Average of sum is " +sum);
		System.out.println("Average of array is " +average);
		
	}

}
