import java.io.*;

public class CylinderTest 
{
	public static void main(String[] args) throws Exception 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius");
		String input1=br.readLine();
		System.out.println("Enter teh height");
		String input2=br.readLine();
		double radius=Double.parseDouble(input1);
		double height=Double.parseDouble(input2);
		double pi=3.14;
		double area=pi*2*radius*(radius+height);
		System.out.println(area);
		
	}

}
