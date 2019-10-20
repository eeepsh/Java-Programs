
public class CharacterTest
{
	public static void main (String [] arg)
	{
		
		int upperCaseCounter=0, lowerCaseCounter=0, specialCharCounter=0, whiteSpaceCounter=0, digitsCounter=0;
		
		String s="helo Jack your rose is lost now &&& i havent stolen her$$";
		for(int i=0; i<s.length(); i++)
		
		{
			char ch =s.charAt(i);
		if (Character.isAlphabetic(ch))
		{
			if (Character.isUpperCase(ch))
			{
				System.out.println("Upper alpha");
				upperCaseCounter++;
			}
			else
			{
				System.out.println("Lower alpha");
				lowerCaseCounter++;
			}
		}
		else if (Character.isDigit(ch))
		{
			System.out.println("digit");
			digitsCounter++;
		}
		else
		{
			if (Character.isWhitespace(ch))
			{
				System.out.println("white space");
				whiteSpaceCounter++;
			}
			else
			System.out.println("special character");
			specialCharCounter++;
		}
		}
		System.out.println("TThe number of lower case are " +lowerCaseCounter);
		System.out.println("TThe number of upper case are " +upperCaseCounter);
		System.out.println("TThe number of lower case are " +specialCharCounter);
		System.out.println("TThe number of lower case are " +whiteSpaceCounter);
		System.out.println("TThe number of lower case are " +digitsCounter);
		
		//boolean result= Character.isWhitespace(ch);
		//System.out.println(result);
		
		
	}

}
