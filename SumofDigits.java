package com.Abhishek;
import java.util.*;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum = 0;
		int remainder = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number: ");

		n = scanner.nextInt();
		
		if(n>=0) {
			do {
				remainder = n%10;
				sum = sum + remainder;
				n = n / 10;
				
			}
			while(n>0);
			System.out.print("Sum of digits are " +sum);
			
		}
		else {
			System.out.print("Invalid number ");

		}
		


	}

}
