import java.io.*;
public class Reverse 
{
public static void main(String[] args) throws Exception
{
	
	  BufferedReader be= new BufferedReader (new InputStreamReader(System.in));
	  System.out.println("Enter the number");
	  int no=Integer.parseInt(be.readLine());
	  
	  int temp=no;
	  int sum=0;
	  
	  while(temp!=0)
  {
		int digit= temp%10;
	  System.out.print(digit);
	  temp=temp/10;
	  sum=sum+digit;
  }
	 
	 System.out.println("\n" +sum);

}
}
 