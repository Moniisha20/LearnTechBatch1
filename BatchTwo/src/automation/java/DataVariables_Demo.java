package automation.java;

import java.util.Scanner;

public class DataVariables_Demo {

	private void nextLinefn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name");
		String name = sc.nextLine();
		System.out.println("Enter your full name is " + name);
	}
	
	
	public static void main(String[] args) {
		
		// Scanner Class will be used to get values from user
		//It gets the input from the user at the run time
		//It is present in the package Java.util
		
	//	Scanner refname = new Scanner(System.in);
		byte age = 27 ;
		System.out.println(age);
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age1 = sc.nextInt();
		System.out.println("your age is:" + age1);
		
		System.out.println("Enter your full name");
		String nl = sc.next();
		System.out.println("Your full name is : " + nl);
		DataVariables_Demo d = new DataVariables_Demo();
		d.nextLinefn();
		
	}
	
}
