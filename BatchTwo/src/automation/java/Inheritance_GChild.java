package automation.java;

public class Inheritance_GChild extends Inheritance_ChildA {

	public void modulus()
	{
		int a = 5 , b= 2;
		int c = a%b;
		System.out.println("Your answer is " + c);
	}
	
	public static void main(String[] args) {
		Inheritance_GChild gc = new Inheritance_GChild();
		gc.modulus();
		gc.multiply();
		gc.add();
		gc.sub();
	}
}
