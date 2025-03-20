// 3. Take input from the user (name and age) and print a greeting message.  

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("Enter your name:");
		name = sc.nextLine();
		System.out.print("Enter your age:");
		age = sc.nextInt();
		
		
		System.out.print("Hello My name is "+name+" I am "+age+ " old");
	}
}
