package automation.java;

import java.util.Scanner;

public class Even_or_Odd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your value");
	int i = sc.nextInt();
	//int result = i%2;

	if(i%2==0)
	{
		System.out.println("It is Even number");
	}
	else
	{
		System.out.println("It is Odd Number");
	}
}
}
