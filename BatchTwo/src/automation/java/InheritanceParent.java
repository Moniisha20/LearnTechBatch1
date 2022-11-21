package automation.java;

public class InheritanceParent {


	 void add()
	{
		int a = 7, b = 3;
		int c =a+b;
		System.out.println("Value of c = " + c);
		
	}
	 void sub()
	{
		int a = 7 , b = 3;
	//	a = a + b;
		//float f = 7.3f;
		int s = a -b ;
	//	f = s * f ;
		System.out.println("Value of S = " + s );
	}
	
	 void multiply()
	{
		int a = 7 , b= 7 ;
		a = a*b;
		System.out.println("Your answer is " + a);
	}
	
	public static void main(String[] args) {
		System.out.println("Addition and Subtraction Methods");
		InheritanceParent in = new InheritanceParent();
		in.add();
		in.sub();
	}
	
}
