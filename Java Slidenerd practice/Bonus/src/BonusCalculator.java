import java.io.*;

public class BonusCalculator
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter employe salary");
		String input1=br.readLine();
		System.out.println("Enter bonus % :   ");
		String input2=br.readLine();
		double salary=Double.parseDouble(input1);
		double bonus =Double.parseDouble(input2);
		double total= salary+bonus/100*salary;
		System.out.println("The total salary is: "+ total);
		
		
	}

}
