
public class ForConstructors
{
	public static void main(String arg[])
	{
		//A a=new A();
		//B b=new B();
		C c=new C();
	}

}
class A
{
	public A()
	{
		System.out.println("insisde constructors A");
	}
	
}

class B extends A
{
	public B()
	{
		System.out.println("insisde constructors B");
	}
}

class C extends B
{
	public C()
	{
		System.out.println("insisde constructors C");
	}
}
