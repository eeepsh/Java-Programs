
public class StaticMethodsTest
{
	public static void main(String args[])
	{
		Test test=new Test();
		test.normalMethod();
		Test.staticMethod();
	}

}
class Person
{
	String name;
	String address;
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
		
	}
	
	public static void calculateAge(int day, int month, int year)
	{
		
	}
	
}
class Test
{
	int normalVariable=1;
	static int staticVariale=7;
	
	public void normalMethod()
	{
		System.out.println("inside normal methods");
		
	}
	public static void staticMethod()
	{
		Test t= new Test();
		t.normalMethod();
		System.out.println("hello  hi");
		System.out.println("hello  " +t.normalVariable);
		System.out.println("hello  " +staticVariale);
		//staticMethod();
		
	}
}












