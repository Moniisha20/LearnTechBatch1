package automation.java;

public class Constructor_Super_Demo extends Constructor_This_Demo {
public Constructor_Super_Demo()
{
	
	System.out.println("Child DEfault Constructor");
}
public Constructor_Super_Demo(int empid)
{
	super();
	System.out.println("My empId :" + empid);
}
public static void main(String[] args) {
	Constructor_Super_Demo r = new Constructor_Super_Demo();
	System.out.println("                  ");
	Constructor_Super_Demo r2 = new Constructor_Super_Demo(12346);
}

}
