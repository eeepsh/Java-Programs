
public class PrimeTest
{
	public static void main (String[] args)
	{
		
		int numberofFactors=0;
		for(int j=2;j<=100; j++)
		{
			
		
		for(int i=1;i<=j;i++)
		{
			double result=(double) j/i;
			if(result==Math.ceil(result))
			{
				numberofFactors++;
				
			}
			
		}
		if(numberofFactors==2)
		{
			System.out.println(j +" is the prime number");
		}
		else
		{
			System.out.println(j + " is the composite number");
		}
		numberofFactors=0;
	}

	}
}
