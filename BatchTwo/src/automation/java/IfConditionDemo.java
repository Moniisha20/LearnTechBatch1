package automation.java;

import java.util.Scanner;

public class IfConditionDemo {
	
	public void testing(String Nationality) {
		if(!Nationality.equals("India"))
			{
				System.out.println("You are an Indian Eligible to vote");
	
			}
		else
			{                                                                                                                                                                                                                                  
				System.out.println("Check your nationality");
			}
				
		}
	
	public void testing(int age) {
		if(age>=18)
			{
				System.out.println("You are Eligible to vote");
	
			}
		else
			{
				System.out.println("Underaged");
			}
	}
	

	
	public static void main(String[] args) {
		IfConditionDemo lc = new IfConditionDemo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your country :");
		String as = sc.nextLine();
		System.out.println("Your entered Country is " + as);
		lc.testing(as);
		System.out.println("Enter your Age");
		int a = sc.nextInt();
		lc.testing(a);
		
	
	}
}
