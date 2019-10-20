import java.io.*;

public class BmiTest 
{
	public static void main(String arg[]) throws Exception
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		int kg;
		System.out.println("Enter weight in kg");
		kg=Integer.parseInt(br.readLine());
		
		System.out.println("Enter height in cm");
		double height= Double.parseDouble(br.readLine());
		double meter =height/100;
		
		double bmi=(double)kg/(meter*meter);
		
		if (bmi<18.5)
		{
			System.out.println("you are under weight");
		}
		else if(bmi>=18 && bmi<25)
		{
			System.out.println("yu are normal");
		}
		else if (bmi>=25 && bmi<30)
		{
			System.out.println("u are over weight");
		}
		else if(bmi>=30)
		{
			System.out.println("you are too fat");
			
		}
		else
		{
			System.out.println("yor input incorrect data");
		}
		
		
	}

}
