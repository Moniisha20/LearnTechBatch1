package automation.java;

public class Constructor_This_Demo {
	public Constructor_This_Demo()
	{
		this(34);
		System.out.println("Default Constructor");
	
	}
	public Constructor_This_Demo(int age)
	{	this(76.8f);
		System.out.println("Your age is: " + age);
	}
	public Constructor_This_Demo(float avg)
	{
		this("moni");
		System.out.println("Your average value is: " + avg);
	}
	public Constructor_This_Demo(String name)
	{
	System.out.println("Your name is " + name);	
	}
public static void main(String[] args) {
	Constructor_This_Demo obj = new Constructor_This_Demo();
}
}
