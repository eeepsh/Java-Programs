
package distance;
import java.io.*;

public class distanceTest 
{
	public static void main(String[] args)
	throws Exception
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		int kg;
		System.out.println("Enter weight");
		kg=Integer.parseInt(br.readLine());
		System.out.println("Enter the height in cm ");
		double height=Double.parseDouble(br.readLine());
		height=height/100;
		
		double bmi=kg/(height*height);
		
		if(bmi<18.5)
		{
			System.out.println("You are under weight ");
			
		}
		else if(bmi>=18.5 && bmi<25)
		{
			System.out.println(" You are normal...");

		}
		else  if(bmi>=25 && bmi<30)
		{
			System.out.println(" You are over weight");

		}
		else if (bmi>=30)
		{
			System.out.println(" You are OBESE");
		

		}
		else 
		{
			System.out.println(" Incorrect BMI");

		}
		
		
		
	}

}
