
public class MethodsTest
{
	public static void main(String[] args) throws Exception
	{
		String s="Hello,its,me deepa";
		String s2="Hello its me deepa";
	//	String s3= s1+s2;
	//	System.out.println(s3);
		
	// to give the value of any position methods >> s.chartAt()
	//	char c= s.charAt(10);
	//	System.out.println(c);
		
		
	
		// to find the ascii value  methods>> s.codePointAt()
		
		//int ascii=s.codePointAt(0);
		//System.out.println(ascii);
				
		//to compare two strings methods>>s.compareTo()
		
		int x=s2.compareToIgnoreCase(s);
		System.out.println(x);
		
		//to check the contents methods>> s.cotains("")
		boolean YesNo=s.contains("He");
		System.out.println(YesNo);
		
		//to compare methods>> s.equals()
		//boolean result=s.equalsIgnoreCase(s2);
		//problem with equals i,e only similar objects can be compared not string objects and buffer objects
		StringBuffer b= new StringBuffer("Hello its me deepa");
		System.out.println(s.equals(b));
		
		//solution to above problem is methods>> s.contentEqual()
		
		System.out.println(s.contentEquals(b));
		
		//for validation to check starting and ending methods>> s.startsWith("")
		
		boolean result=s.startsWith("its",6); // 6 is the content position to start to check
		System.out.println(result);
		// methods>> s.endsWith("")
		boolean results=s.endsWith("b");
		System.out.println(results);
		
		//to find the position of any index methods>> s.indexOf("")
		int position=s.indexOf("e",9); //start to count from 9
		int positio=s.lastIndexOf("e",8);
		System.out.println(position);
		System.out.println(positio);
		
		
		//for replacement of old character by new one methods>> s.replace('old','new')
		String s4= s.replace('e','o');
		System.out.println(s4);
		
		//to split methods>> s.split("")
		
		String a[]=s.split(",");
		for( int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		//for substring methods>> s.substring()
		
		String s5=s.substring(5,10);
		System.out.println(s5);
		
	}

	
	
}
