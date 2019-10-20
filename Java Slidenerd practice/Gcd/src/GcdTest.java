import java.io.*;

public class GcdTest 
{
	public static void main(String[] arg) throws Exception
  {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter the numbers");
	 int a=Integer.parseInt(br.readLine());
	 int b=Integer.parseInt(br.readLine());
	 int gcd=0;
	 
	 if(a==0 || b==0)
	 {
		 System.out.println("Gcd is 0");
	 }
	 else
	 {
		 if(a<b)
		 {
			 for(int i=a; i>0; i--)
			 {
				 if(a%i==0 && b%i==0)
				 {
					 gcd=i;
					 break;
				 }
			 }
		 }
		 else if(a>b)
		 {
			for(int j=b; j>0; j--)
			{
				if(a%j==0 && b%j==0)
				{
					gcd=j;
					break;
				}
			}
		 }
		 else
		 {
			 gcd=a;
		 }
		 System.out.println("gcd is: " +gcd);
	 }
	 
  }
}
