package com.Abhishek;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// size of array
		int size;
		
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
		
		//reverse
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
