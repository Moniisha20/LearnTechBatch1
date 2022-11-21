package automation.java;

public class While_Loop {
public static void main(String[] args) {
	int a = 100 ;
//While Statement
/*	while(a<10)
	{
		System.out.println(a);
		a++;
	}*/
	
//Do While Statement
	System.out.println("Do While Statement");
	do {
		System.out.println(a);
		a--;
		if(a==72)
		{
			continue ;
		} 
	}
	while(a>10);
}
}
