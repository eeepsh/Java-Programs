import java.io.*;

public class FctorialTest
{
	public static void main(String[] args)
	throws Exception
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number");
		int no=Integer.parseInt(br.readLine());
		int product=1;
		
		
		for(int i=1; i<=no; i++)
		{
			product=product*i;
		}
		System.out.println(product);
		
	}

}
