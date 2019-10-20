import java.io.*;
public class SphereTest {
	public static void main(String[] args) throws Exception{
		System.out.println("Enter radious");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		double radius=Double.parseDouble(input);
		double pi=3.14;
		double volume=4/3*pi*radius*radius*radius;
		System.out.println("The volume of sphere is: "+volume);
	}

}
