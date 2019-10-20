import java.io.*;

public class DecialToBinary
{
	public static void main(String[] args)
	throws Exception
	{
	
		
		

		// method 1>>>>
		  /* {
			int no=14;
			System.out.println(Integer.toBinaryString(no));
		}

		 
	method2 decimal to octal>>>
		
		 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int no=Integer.parseInt(br.readLine());
		
		StringBuffer bf= new StringBuffer();
		while (no!=0)
		{
			int digit=no%8; //1
			bf.append(digit);//1
			no=no/8; 
			
		}
		bf.reverse();
		System.out.println(bf);
		
		
		//method 1 Decimal to octal>>
		
		/*
		int no=15;
		System.out.println(Integer.toOctalString(no));
				
		
		
	*/
		
		
	// method 1 Decimal to hexadecimal
		/* int no=20;
		 System.out.println(Integer.toHexString(no));
		 
		 */
		 
		
		//method 1 binary to decimal
		
	/*	int no=0b1110;
		System.out.println(no);
		*/
		
		
		
		//method 2 binary to decimal
		
	/*	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter only binary number");
		int no=Integer.parseInt(br.readLine(), 2);
		System.out.println(no);
		*/
		
		
		
		//metod1 Hexadecimal to decimal
		
		/*
		 int x=0xAAFF;
		 
		System.out.println(x);
		
		
		*/
		
		
		//method 2 HExadecimal to decimal
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter only hexadecimal number");
		int no=Integer.parseInt(br.readLine(), 16);
		System.out.println(no);
		
		
		
	}
	
	
	
	}
	
	
	


