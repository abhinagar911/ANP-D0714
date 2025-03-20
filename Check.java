// 5. Write a program to check if a number is even or odd.  

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Enter first number:");
		num = sc.nextInt();
		if(num % 2==0)
		System.out.println("Number is even");
		else
			System.out.println("Number is odd");
		

	}
}
