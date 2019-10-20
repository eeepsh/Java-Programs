import java.io.*;
public class Palindrome 
{
	public static void main (String[] args) throws Exception
	{
		BufferedReader de= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter teh number");
		int no=Integer.parseInt(de.readLine());
		
		StringBuffer be= new StringBuffer(no + " ");
		be.reverse();
		String x = be.toString(); 
		int rev=Integer.parseInt(x);
		
		if(no==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("nope");
		}
	
	}
 
}
