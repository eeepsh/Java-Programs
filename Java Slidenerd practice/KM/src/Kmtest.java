 import java.io.*;
public class Kmtest {

	public static void main (String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the distance in meter");
		double meter= Double.parseDouble(br.readLine());
		// 1 meter=39.3701 inch
		// 1miles=63360 inches
		double inches=meter*39.3701;
		int miles=(int)inches/63360;
		System.out.println( miles );
		int feet=(int)(inches-miles*63360)/12;
		System.out.println(feet);
		int inch=(int)(inches-miles*63360-feet*12);
		System.out.println(inch);
		
	}
}
 