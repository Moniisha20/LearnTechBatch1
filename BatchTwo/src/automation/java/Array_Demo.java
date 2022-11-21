package automation.java;

public class Array_Demo {
public static void main(String[] args) {
	//If no value is assigned to array, it will give default value of datatype.
	//Example 1
	int a [] = new int [4];
//	System.out.println(a[2]);
	
	String b [] = new String [4];
//	System.out.println(b[3]); 
	
	//Example 2
	int n[] = new int [4]; //0 to n-1
	n[0] = 1 ;
	n[1] = 10 ;
	n[2] = 100 ;
	n[3] = 1000 ;
	//n[2] = 70 ;
	
	//System.out.println(n[2]);


	for(int i = 0; i<n.length ; i++) //n.length defines the array length
	{
		System.out.println(n[i]); //n[i] it results the value in the array
	// If [i] only executed, it results 0,1,2,3. not the value in it.
	}
	//Enhance For Loop
	for(int i : n)
	{
		System.out.println(i);
	}
}
}
