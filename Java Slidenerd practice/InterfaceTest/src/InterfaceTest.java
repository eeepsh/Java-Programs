
public class InterfaceTest implements MyInterface
{
	public static void main(String args[])
	{ 
	InterfaceTest interfaceTest= new InterfaceTest();
	interfaceTest.display();
	
	
	}

	@Override
	public void display()
	{
		System.out.println("Hllo from interface");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}


}
interface MyInterface
{
	public void display();
	public void test();
	
	
	
	
}
	
