package my.java.app.myArray;

public class ArrayDemo {

	public static void main (String[] args)
	{
		int[] anArray;
		anArray = new int[10];
		
		anArray[0]=1;
		anArray[1]=23;
		anArray[2]=456;
		anArray[3]=78910;
		
		System.out.println(anArray[0]);
		System.out.println(anArray[1]);
		System.out.println(anArray[2]);
		System.out.println(anArray[3]);
		System.out.println(anArray.length);
	}
}
