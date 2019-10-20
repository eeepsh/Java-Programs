import  java.io.*;
public class Numeric 
{
	public static void main(String[] arg) 
	{
		/*System.out.println("    1");
		System.out.println("   2 2");
		System.out.println("  3 3 3");
		System.out.println(" 4 4 4 4 ");
		System.out.println("5 5 5 5 5");
		
		int noOfSpaces=4;
		for(int i=1;i<=5; i++)
		{ 
			for(int j=noOfSpaces; j>=1 ; j--)
			{
				System.out.print(" ");
			}
		
			for(int j=1; j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			noOfSpaces=noOfSpaces-1;

		}	*/
		
		/*      1
		 *     121
		 *    12321
		 *   1234321
		 *   
	
		 */
		int odd=1;
		int size=9;
		int noOfSpaces=size-1;
		
		for(int i=1; i<=size; i++)
			  
		{
			int k=0;
			for( int j=1; j<=noOfSpaces; j++);
			{
				System.out.print(" ");
			}
			for (int j=1; j<=odd; j++)
			{
				if(j<=i)
				{
					k=k+1;
				}
				else
				{
					k=k-1;
				}
				System.out.print(k);
			}
			System.out.println();
			odd=odd+2;
			noOfSpaces=noOfSpaces-1;
		}
		
		
		
	}
	
	

}
