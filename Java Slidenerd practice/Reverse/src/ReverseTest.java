import java.io.*;
public class ReverseTest 
{
	public static void main(String [] args) throws Exception
	{
		
		//method 1
		
	/*	BufferedReader reader=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter number");
		int no=Integer.parseInt(reader.readLine());
		StringBuffer b=new StringBuffer(no +" ");
		b.reverse();
		System.out.println(b);
		*/
		
		// method 2
		/*String s="hello";
		 String x= s.concat(" world");
		 System.out.println(s);
		 System.out.println(x);
		 
		 StringBuffer b=new StringBuffer("hello");
		 StringBuffer y=b.append(" everyone");
		 System.out.println(b);
		 System.out.println(y);
	*/ 
		//method 3
		//sum of digits of reverse number
		
		BufferedReader reader=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter number");
		int no=Integer.parseInt(reader.readLine());
		
		int temp=no;
		int sum=0;
		while(temp!=0)
		{
			int x=temp%10;
			System.out.print(x);
			sum=sum+x;
			temp=temp/10;
		}System.out.println("\n" +sum);
		 
		
	
		
	}

}
