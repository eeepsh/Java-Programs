import java.io.*;
public class CircleTest {
	
	public static void main( String arg[])throws Exception
	{
		
		System.out.println(" enter the radius"); 
		
		
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		String input= br.readLine();
		double radius= Double.parseDouble(input);
		double pi=3.14;
		double area=pi*radius*radius;
		System.out.println("The area is :" + area);
		
		
		
	}
		}


