package my.java.app.PrimeNumber;

public class GoodPrime {
	
	public static void main(String[] args)
	{
		GoodPrime findPrime = new GoodPrime();
		
		
		System.out.println(findPrime.isPrime(11));
	}
	
	public boolean isPrime (int x)
	{
		if(x<=1)
		{
			return false;
		}
		for(int i=2;i<x;i++)
		{
			if(x%i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
