import java.io.*;
public class ConverterTest {
	/** public static void main(String[] args) throws Exception {
		System.out.println("Enter the distace in miles: ");
		 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		 String input=br.readLine();
		 double miles= Double.parseDouble(input);
		 double kms= 1.609*miles;
		 System.out.println("The converted value in kms is " + kms + " km");
		 
	}
*/
	
	
	public static void main(String[] args) throws Exception{
		System.out.println("Enter the temperature in Fahrenheit: ");
		BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
		String input= br.readLine();
		double fahrenheit=Double.parseDouble(input);
		double celsius=(fahrenheit-32)*5/9;
		System.out.println("The converted values in celsius is: "+ celsius+"degree");
	}
}
