package my.java.app.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class MyHashSet {

	public static void main(String[] args) {
		
		ArrayList cars = new ArrayList<>();
		Integer number = new Integer(5);
		cars.add("Tata");
		cars.add("Toyota");
		cars.add("Maruti");
		cars.add("Maruti");
		cars.add(4);
		cars.add("Toyota");
		cars.add("Tata");
		cars.add("Toyota");
		cars.add(number);
		
		MyHashSet carsHashset = new MyHashSet();
		System.out.println(carsHashset.getArraylist(cars));
	}

	public HashSet getArraylist(ArrayList arraylist)
	{
		HashSet myarraylist = new HashSet(arraylist);
		return myarraylist;
	
	}
}
