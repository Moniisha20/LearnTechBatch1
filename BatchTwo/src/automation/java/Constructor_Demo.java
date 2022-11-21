package automation.java;

public class Constructor_Demo {
public Constructor_Demo()
{
	System.out.println("Default Constructor");
}
public Constructor_Demo(int age)
{
	System.out.println("Your age is: " + age);
}
public Constructor_Demo(float avg)
{
	System.out.println("Your average value is: " + avg);
}
public Constructor_Demo(String name)
{
System.out.println("Your name is " + name);	
}
public static void main(String[] args) {
	Constructor_Demo obj = new Constructor_Demo();
	Constructor_Demo obj4 = new Constructor_Demo("moni");
	Constructor_Demo obj2 = new Constructor_Demo(23);
	Constructor_Demo obj3 = new Constructor_Demo(78.6f);
}
}
