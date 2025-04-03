package com.Abhishek;
import java.util.*;

public class BiggestElement {

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

		
		//biggest number
		int max =arr[0];
		
		//checking the biggest number
		for (int i=0;i<arr.length;i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("Biggest element in array is "+max);

	}

}
