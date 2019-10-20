
public class InstanceOfVariable 
{

	public static void main(String args[])
	{
		Parent p= new Parent();
	//	System.out.println(p instanceof Child );
		//Child c= new Child();
		//System.out.println(c instanceof Child);
		if(p instanceof Child)    // it helps to remove exception
		{
			Child c=(Child) p;
			System.out.println(c);
		}
		else
		{
			System.out.println("it cannt be type casted");
		}
		
	}
}
class Parent
{
	
}

class Child extends Parent
{
	
}
