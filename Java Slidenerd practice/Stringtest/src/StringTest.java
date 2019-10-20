import java.io.*;
public class StringTest
{

	public static void main(String[] arg) throws Exception
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter String :");
		String data = br.readLine();
		
		System.out.println("Enter character :");
		char ch = (char) System.in.read();
		
		int noOfTimesWasFound =0;
		 for(int i=0; i<data.length(); i++)
		 {
			 char c= data.charAt(i);
			 if(c==ch)
			 {
				 noOfTimesWasFound ++;
				 
			 }
		 }
		 System.out.println(noOfTimesWasFound);
	}
}
