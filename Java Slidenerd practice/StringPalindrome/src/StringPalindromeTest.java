
public class StringPalindromeTest
{
	public static void main(String[] args) throws Exception
	{
		String s1="ab";
		StringBuffer b=new StringBuffer(s1);
		System.out.println(s1);
		System.out.println(b);
		b.reverse();   // finding reverse of string b
		String s2=b.toString();
		
		if (s1.equals(s2))
		{
			System.out.println("It is palindrome.");
			
		}
		else
		{
			System.out.println("It is not a palindrome.");
		}
		
	}

}
