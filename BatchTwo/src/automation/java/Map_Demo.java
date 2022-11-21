package automation.java;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Demo {
public static void main(String[] args) {
	Map<Integer, String> li = new LinkedHashMap<Integer, String>();
	
	li.put(10, "Anu");
	li.put(20, "Razeem");
	li.put(null, null);
	li.put(60, null);
	li.put(30, "Vel");
	li.put(40, "Anu");
	li.put(10, "Susee");
	System.out.println(li);
	
	//To get the particular value
	System.out.println("                           ");
	System.out.println("To get the particular value");
	String st = li.get(20);
	System.out.println(st);
	
	//To check whether particular key is present or not
	System.out.println("                           ");

	System.out.println("To check whether particular key is present or not");
	boolean ck = li.containsKey(60);
	System.out.println(ck);
	
	//To check whether particular value is present or not
	System.out.println("                           ");
	System.out.println("To check whether particular value is present or not");
	boolean cv = li.containsValue("Vel");
	System.out.println(cv);
	
	//To get the keys alone
	System.out.println("                           ");
	System.out.println("To get the keys alone");
	Set<Integer> ks = li.keySet();

	System.out.println(ks);
	
	//To get the values alone
	System.out.println("                           ");
	System.out.println("To get the values alone");
	Collection<String> r = li.values();
	System.out.println(r);
	

	//Iteration
	System.out.println("                           ");
System.out.println("FOR LOOP");
	Set<Entry<Integer,String>> es = li.entrySet();
	for(Entry<Integer, String> x : es)
	{
		System.out.println(x.getKey());
		System.out.println(x.getValue());
	}
	
}
}
