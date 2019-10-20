
import java.io.*;
public class test {
	public static void main(String[] args) throws Exception{ 
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter your name");
		String data = br.readLine();	
		System.out.println("your name is "+ data);
	}

}
