import java.io.*;
public class ConverterTest {
	/**public static void main (String[] args)
	{
		int big=127;
		byte small;
		small=(byte)big;
		System.out.println(small);
	}
	*/

	
	public static void main (String[]  args)throws Exception 
	{
		System.out.println("Enter characters");
		int x=System.in.read(); // this reads only on characer even if u enter many character
		
		System.out.println(x);
	}
}
