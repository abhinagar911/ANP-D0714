// 4. Swap two numbers without using a third variable.

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		System.out.print("Enter first number:");
		a = sc.nextInt();
		System.out.print("Enter second number:");
		b = sc.nextInt();
		
		a = a+b;
		b = a-b;
		a =a-b;
		
		System.out.println("first number is "+a);
            System.out.println("Second number is "+b);
    }
}
