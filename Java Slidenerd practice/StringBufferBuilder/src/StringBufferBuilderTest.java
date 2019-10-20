
public class StringBufferBuilderTest 
 {
	public static void main(String[] ars) throws Exception
	{ 
		//part1
		// String s1="hello";
		
		// StringBuffer b1=new StringBuffer(s1);
		// StringBuilder b2=new StringBuilder(s1);
		 
		// b1.append(10);
		// System.out.println(s);
		// System.out.println(b1);
		
		
	 StringBuffer b=new StringBuffer("Hello its me Deepa  :");
	 //StringBuffer x=b.append(14);
	// System.out.println(x);
	 
	 //to delete any character methods>> deleteCharAt()
	 
	// b.deleteCharAt(0);
	// System.out.println(b);
	 
	 
	 //array of char
	  char[] arr=new char[4];
	  b.getChars(6,10,arr,0);
	  
	  
	  for(int i=0; i<arr.length; i++)
	  {
		  System.out.println(arr[i]);
	  }
	  System.out.println(b);
	  
	 
	  
	  //to insert any char, string,boolean 
	  //b.insert(6, "sapkota" );
	 // b.setCharAt(0, 'D');
	 // b.setLength(10); //length upto 10
	 // b.reverse();
	  b.replace(0, 5, "hi");
	  System.out.println(b);
	}

}
