package automation.java;

public class Concat_Append {
public static void main(String[] args) {
	//Immutable - After Concat, it stores value in new memory address
	System.out.println("Immutable");
	String s1 = "Monisha";
	String s2 = "Monisha";
	String c = s1.concat(s2);
	
	System.out.println(c);


	//System.out.println(s2.concat(s1));
	
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	System.out.println(System.identityHashCode(c));
	System.out.println("                ");
	//Mutable. String Buffer - After Appending it stores in 1st memory address.
	//Keyword = String Buffer
	System.out.println("Mutable String Buffer");
	StringBuffer b1 = new StringBuffer("Monisha");
	StringBuffer b2 = new StringBuffer("Monisha");
	StringBuffer app = b2.append(b1);
	System.out.println(app);
	System.out.println(System.identityHashCode(b1));
	System.out.println(System.identityHashCode(b2));
	System.out.println(System.identityHashCode(app));
	
	//Mutable. String Builder - After Appending it stores in 1st memory address.
	//Keyword - String Builder
	System.out.println("                ");
	System.out.println("Mutable String Builder");
	StringBuilder c1 = new StringBuilder("Monisha");
	StringBuilder c2 = new StringBuilder("Monisha");
	StringBuilder app1 = c1.append(c2);
	System.out.println(System.identityHashCode(c1));
	System.out.println(System.identityHashCode(c2));
	System.out.println(System.identityHashCode(app1));
	
	
	
}
}
