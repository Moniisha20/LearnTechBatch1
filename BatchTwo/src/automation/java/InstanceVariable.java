package automation.java;

public class InstanceVariable {
int a = 10 , b = 20 , c ;

private void add()
{
	int d = 20 , c = 5 ;
    int a = d + c;
	 c = a + b;
	System.out.println(c);
}
private void sub()
{
	int c = a - b ;
	System.out.println(c);
}
public static void main(String[] args) {
	InstanceVariable i = new InstanceVariable();
	i.add();
	i.sub();
    int a = 20 , c = 5 ;
    int d = a + c;
    
    System.out.println("Value :" + a);
    
    
}
}
