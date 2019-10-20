
public class AbstractClassTest
{
	public static void main(String args[])
	{
		MySuperClass s=new MySubClass();
	}
			

}
abstract class MySuperClass
{
	String name="My SuperClass";
	
	public void sayHello()
	{
		System.out.println("hello ");
	}
	abstract public void printInfo();
	
	
}

class MySubClass extends MySuperClass
{
	public void printInfo()
	{
		throw new UnsupportedOperationException("not supported yet. "); //to change body of generated methods
	}
}
	
