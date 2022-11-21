package automation.java;

import java.util.Scanner;

public class Switch_Condition {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your booking day");
	String choice = sc.nextLine();
	switch(choice)
	{
	case "sunday" :
		System.out.println("one");
		break ;
		
	case "monday" :
		System.out.println("Two");
		break ;
		
	case "tuesday" :
		System.out.println("Three");
		break ;
		
	case "wednesday" :
		System.out.println("Four");
		break ;
	case "Thursday" :
		System.out.println("Five");
		break ;
	case "Friday" :
		System.out.println("Six");
		break ;
	case "Saturday" :
		System.out.println("Seven");
		break ;
		
	default:
		System.out.println("Enter Correct Day");
		break ;
	}
}
}
