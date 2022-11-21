package automation.java;

public class String_Demo {
	public static void main(String[] args) {
		//Literal String
		
		System.out.println("Literal String");
		String a = "Selenium";
		String a1 = "Selenium";
	//	System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(a1));
		
		//Non Literal String
		System.out.println("Non Literal String");
		String b = new String("Oracle");
		String b1 = new String("Oracle");
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(b1)); 
		
	}
	
}
