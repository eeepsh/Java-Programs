import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LcmTest
{
	public static void main(String[] arg) throws Exception
	  {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the numbers");
		 int a=Integer.parseInt(br.readLine());
		 int b=Integer.parseInt(br.readLine());
		 int lcm=0;
		 // 0 0 lcm=o
		 if(a==0 || b==0)
		 {
			 lcm=0;
		 }
		 // 4 4 lcm=4
		 else 
		 {
			 if (a==b)
			 {
				 lcm=a; 
			 }
			 else if(a<b)
			 {
				 if(b%a==0)
				 {
					 lcm=b;
					 
				 }
				 else
				 {
					int factor=2; 
					boolean foundLCM=false;
					while(foundLCM==false)
					{
						int multiple=b*factor;
						if(multiple%a==0)
						{
							lcm=multiple;
							foundLCM=true;
						}
						factor++;
					}
							
				 }
			 }
			 else if(a>b)
			 {
				 if(a%b==0)
				 {
					 lcm=a;
				 }
				 else
				 {
						int factor=2; 
						boolean foundLCM=false;
						while(foundLCM==false)
						{
							int multiple=a*factor;
							if(multiple%b==0)
							{
								lcm=multiple;
								foundLCM=true;
							}
							factor++;
						} 
				 }
			 }
			 
		 }
		 System.out.println("Lcm is "+lcm);
	  }

	  }
	
