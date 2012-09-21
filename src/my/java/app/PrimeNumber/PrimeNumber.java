package my.java.app.PrimeNumber;

public class PrimeNumber {
	
	public static void main (String[] args)
	{

		PrimeNumber check = new PrimeNumber();
		check.getPrime(254);

	}
	
	public void getPrime(int primeNo)
	{
		int count = 0;
		for (int i=1; i<=primeNo; i++)
		{
			int mod = primeNo % i;
			if(mod==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.println("Value is prime number");
			}
			else
			{
				System.out.println("Value is not prime number");
			}
		
	}

}
