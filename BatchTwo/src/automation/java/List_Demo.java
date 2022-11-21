package automation.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Demo {
public static void main(String[] args) {
	List li = new ArrayList();
	//To add the values to list
	li.add(10);
	li.add("Monisha");
	li.add(10.78f);
	li.add(true);
	li.add(27);
	li.add("Hello");
	System.out.println(li);
	
//Wrapper Class can be used in collection.
	List<Integer> li2 = new ArrayList <Integer>();//<>-Generics
	li2.add(10);
	li2.add(20);
	li2.add(30);
	li2.add(10);
	System.out.println(li2);
	
//To get the size of the list
	int size = li.size();
	int size1 = li2.size();
	System.out.println(size);
	System.out.println(size1);
	
//To get particular value from list
	int in = li2.get(2);
	System.out.println(in);

//To get index of particular value in list
	int io = li2.indexOf(10);
	System.out.println(io);

//To get last index value
	int lo = li.lastIndexOf(true);
	System.out.println(lo);

	//To add the values inbetween list
	li.add(1,100);//li.add(index_number, value to be added)
	System.out.println(li);
	
	li2.add(2,67);
	System.out.println(li2);
	
//To remove the values(li.remove(no.of.index)
	System.out.println(li);
	li.remove(2);
	System.out.println(li);
	System.out.println("                                              ");
	
//To replace or set the value
	li.set(4, 500);
	System.out.println(li);
	
//To add values of one list to another
	//"addAll" method is to copy from onelist to another.
	
	List li1 = new ArrayList();
	li1.addAll(li);
//	li1.addAll(li2);
	//System.out.println(li1);
	//li1.removeAll(li2);
	System.out.println(li1);
	
	li1.add("monisha");
	//li1.replaceAll(e -> e.toUpperCase());
	li.add(true);
	System.out.println(li);
//To retain all common value in the list
	li1.retainAll(li);
	System.out.println(li1);

	//Iteration - For Loop
	for(int i =0; i<li.size(); i++)
	{
		System.out.println(li.get(i));
	}
	
	//Enhanced For Loop
	for(int x : li2)
	{
		System.out.println(x);
	}

}
}
