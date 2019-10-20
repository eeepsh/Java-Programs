import java.io.*;
public class LeapYearTest
{
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any year");
		int year=Integer.parseInt(br.readLine());
		
		if(year%4==0)
		{
			System.out.println("the provided year is leap year");
		}
		else
		{
			System.out.println("the provided year is not leap year");
		}
	}

}
