package automation.java;

import java.util.Scanner;

public class IfCondition_Demo {

	//Age should be greater than or equal to 18
	
	public static void main(String[] args) {
	//	System.out.println("Enter your name");
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("Your age is " + age);
		
		if(age>=18)
		{
			System.out.println("You are Eligible to Vote");
		
		}
		else
		{
			System.out.println("You are Underaged");
		} 
	}
	
}
