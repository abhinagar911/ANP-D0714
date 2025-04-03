package com.Abhishek;
//Write a program to find the  factorail of a number using recursive fuction.
import java.util.*;
public class factorial {

	// recursive funtion
	 class factoral{
		 public static int facto(int n) {
			 if(n==0)
				 return 1;
			 return n*facto(n-1);
		 }
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num ;
Scanner sc =new Scanner(System.in);
System.out.println(" Enter a number: ");
  num = sc.nextInt();
  int result = factoral.facto(num);
  System.out.println(result);
	}

}
