import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicMethodDispatch
{
	public static void main(String args[])throws Exception
	{ 
		BufferedReader reader=new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter the blog from wheree you wana read \n" +
		"1: Mashable \n 2: TechCrunch \n 3: LifeHacker \n 4: PcWorld \n 5: Digit\n");
		int number=Integer.parseInt(reader.readLine());
		Reader blogReader=null;
		switch (number)
		{
		case 1:
			blogReader=new MashableReader();
			break;
			
		case 2:
			blogReader=new TechCrunchReader();
			break;
			
		case 3:
			blogReader=new LifeHackerReader();
			break;
			
		case 4:
			blogReader=new PcWorldReader();
			break;
			
		case 5:
			blogReader=new DigitReader();
			break;
		default:
		System.out.println("Please select the valid input");
			break;
	}
		
		if(blogReader!=null)
		{
			blogReader.ReadFromBlog();
		}
		
	}

}
class Reader
{
	public void ReadFromBlog()
	{
		System.out.println("reading from any blog");
	}
	
}
class MashableReader extends Reader
{
	public void ReadFromBlog()
	{
		System.out.println("reading from Mashable ");
	}
	
}

class TechCrunchReader extends Reader
{
	public void ReadFromBlog()
	{
		System.out.println("reading from TechCrunch");
	}
	
}

class LifeHackerReader extends Reader
{
	public void ReadFromBlog()
	{
		System.out.println("reading from LifeHacker");
	}
	
}
class PcWorldReader extends Reader
{
	public void ReadFromBlog()
	{
		System.out.println("reading from LifeHacker");
	}
	
}


class DigitReader extends Reader
{
	public void ReadFromBlog()
	{
		System.out.println("reading from DigitReader");
	}
	
}







