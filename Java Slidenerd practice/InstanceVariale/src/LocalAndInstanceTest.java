
public class LocalAndInstanceTest 
{
	public static void main(String [] args)
	{
		Person p=new Person();
		p.display(7);
		p.test();
	}

}
class Person
{
	String firstName;
	String lastName;
	boolean test;
	
	public void display(int p)
	{
		int n=0;
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(test);
		System.out.println(n);
		//System.out.println(firstName.length()); // this gives exception becz firstname methods value is not inatilize
		if(firstName!=null)   //to solve the exception
		{
			System.out.println(firstName.length());
		}
	
	}
	
	public void test()
	{
		//System.out.println(n);     // local variable n is not ascible to other methods
		System.out.println(firstName);   // but instance variable is accible to any methods inside class
	}
}
