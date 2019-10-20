
public class ConstructorsType 
{
	public static void main(String [] args)
	{
		Person p=new Person();
		Person you= new Person("Deepa", "Sapkota", 16);
		Person q=new Person("Deepa");
	//	System.out.println(p.test);
		//p.display(7);
		
	}

}
class Person    
{
	String firstName;
	String lastName;
	//boolean test;
	int age;
	
	Person()
	{
		System.out.println("default Constructor was called");
		firstName=null; lastName=null; age=1;
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
	}
	//Person (String f, String l, boolean t)                     //definition of constructor
	//{
	//	System.out.println("Constructor was called");
	//	firstName=f; lastName=l; test=t;
	//}
	Person(String f, String l, int a)
	{
		System.out.println("parameterizes Constructor was called");
		firstName=f; lastName=l; age=a;
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
	}
	Person(String f)
	{
		/*System.out.println("parameterizes Constructor with only one argument was called");
		firstName="Miss "+f; lastName=null; age=2;
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
	*/
		this(f,null,-1);
	}
}
