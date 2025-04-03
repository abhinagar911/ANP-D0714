package com.Abhishek;
import java.util.*;
public class FactorialForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int factorial=1;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");

n = scanner.nextInt();
for(int i=1;i<=n;i++) {
	 factorial *= i;
	 

}
System.out.println("Factorial of "+n+" is "+factorial);
	}

}
