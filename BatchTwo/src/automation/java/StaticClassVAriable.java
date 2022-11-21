package automation.java;

public class StaticClassVAriable {
static StaticClassVAriable obj ;
private static void add()
{ 
	int a=5,b=6,c ;
	c = a+ b;
	System.out.println(c);
}
private void sub()
{
	int a=15,b=6,c ;
	c = a - b;
	System.out.println(c);
    try
    {
    	System.out.println(c);
    }
    catch(NullPointerException e)
    {
        System.out.print("NullPointerException Caught");
    }
}

public static void main(String[] args) {
add();
obj.sub();
}
}
