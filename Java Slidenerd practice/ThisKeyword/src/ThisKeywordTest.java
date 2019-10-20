
public class ThisKeywordTest
 {
	public static void main(String[] args)
	{
		SomeClass someClass=new SomeClass();
		someClass.no=10;
		someClass.display();
		System.out.println("Someclass  "+ someClass);
		
		SomeClass s2=new SomeClass();
		s2.no=20;
		s2.display();
		System.out.println("s2: "+s2);
	}

}
class SomeClass
{
	int no=1;
	public void display()
	{
		int no=5;
		System.out.println(no);
		System.out.println("this keyword= "+this.no);
	}
	public SomeClass(int no)
	{
		this.no=no;
	}
}
