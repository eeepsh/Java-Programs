
public class HypotenousTest
{

	public static void main(String[] arg)
	{
		for(int a=1;a<=10; a++)
		{
			for (int b=1; b<=10; b++)
			{
				for(int c=1; c<=10; c++)
				{
					if(a*a +b*b==c*c)
					{
						System.out.println(a+" "+b +" "+ c);
					}
					
				}
			}
		}
		
	}
}
