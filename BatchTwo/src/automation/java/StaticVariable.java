package automation.java;

public class StaticVariable {
static int a = 10 , b =20  ;
int d = 10 , e = 20  ;

public static void add()
{
 int c = a+ b;
	System.out.println(c);
}
private static void sub()
{
 int c = a - b;
	System.out.println(c);
}

public static void main(String[] args) {
	add();
	sub();
	StaticVariable.add();
	StaticVariable.sub();
}
}
