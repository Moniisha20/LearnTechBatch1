package automation.java;

public class Inheritance_ChildA extends InheritanceParent {
	@Override
	public void multiply()
	{
		int a = 5 , b= 7 ;
		a = a*b;
		System.out.println("Your answer is " + a);
	}
	@Override
	public void add()
	{
		int a = 4, b = 3;
		int c =a+b;
		System.out.println("Value of c = " + c);
		
	}
	
	public void findEmp(String name) //Depends on Datatype
	{
		System.out.println(name);
	}
	
	public void findEmp(int age) ////Depends on Datatype
	{
		System.out.println("Your age is" + age);
	}
	public void findEmp(String name, long phnno) ////Depends on Order
	{
		System.out.println("Name and Phn.no: " +name + " " + phnno);

	}
	public void findEmp(long phnno, String name) //Depends on Order
	{
		System.out.println("Name and Phn.no: " +phnno + " " + name);

	}
	public void findEmp(long Phnno, String name, boolean status, double salary) //Depends on number
	
	{
		System.out.println(salary + " " + Phnno + " " + name + " " +status );

	}
	
	public static void main(String[] args) {
		Inheritance_ChildA a = new Inheritance_ChildA();
		a.findEmp(45);
		a.findEmp("monisha");
		a.findEmp("monisha", 345676645l);
		a.findEmp(23456789l, "bhuva");
		a.findEmp(3456790l, "kumar", true, 458900.87);
	}
	
	/*public static void main(String[] args) {
		Inheritance_ChildA a = new Inheritance_ChildA();
		a.multiply();
		a.add();
		a.sub();
	//	a.findEmp("moni");
		
	}*/
	
}
