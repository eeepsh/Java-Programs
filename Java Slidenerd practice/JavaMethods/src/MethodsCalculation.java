
public class MethodsCalculation
{
	public static void main(String[] args) throws Exception
	{
		int x=add(5, 18);
		System.out.println(x);
		
		int y=difference(6, 4);
		System.out.println(y);
		
		
		int z=product(5, 5);
		System.out.println(z);
		
		int w=division(25,5);
		System.out.println(w);
		//calculate();
	}
	/*public static void calculate()
	{
		int a=10, b=5;
		
		int sum=a+b;
		System.out.println(sum);
		
		int difference=a-b;
		System.out.println(difference);        // {for dumb method}
		
		int product=a*b;
		System.out.println(product);
		
		int division=a/b;
		System.out.println(a/b);
		
	} */
	
	public static int add(int a, int b)
	{
			
			
			int sum=a+b;
			return sum;
	}
	
	public static int difference(int c,int d)
	{
			
			
			int difference=c-d;
			return difference;
			
	}

	
	public static int product(int a, int b)
	{
			
			
			int product=a*b;
			return product;
	}

	
	public static int division( int a, int b)
	{
			
			
			int division=a/b;
		return division;
	}


}
