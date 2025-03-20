// 2. Write a program to declare two integers and print their sum.  

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		System.out.print("Enter first number:");
		a = sc.nextInt();
		System.out.print("Enter second number:");
		b = sc.nextInt();
		
		int sum = a+b;
		System.out.print("sum of two numbers is "+sum);
    }
}
