
public class ConstructorOverloading 
{
	public static void main(String args[])
	{
		SomeClass s1=new SomeClass();
	}

}
class SomeClass
{
	int x;
	int y;
	boolean z;
	char c;
	
	
	SomeClass()
	{
		this(0,0,false, " ");
	}
	
	SomeClass(int x)
	{
		this(x, 0, false, " ");
	}
	
	SomeClass(int x, int y)
	{
		this(x, y, false, " " );
	}
	
	SomeClass(int x, int y, boolean z, char c)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		this.c=c;
	}
}
