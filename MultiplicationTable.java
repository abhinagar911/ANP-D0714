package com.Abhishek;
import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number: ");
		n = scanner.nextInt();
		while(i<=10) {
			System.out.println(n*i);
			i++;
		}
	}

}
