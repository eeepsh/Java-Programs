
public class MethodOverloadingTest 
{ 
	public static void main(String[] args)
	{
		Maths maths=new Maths();   //className nameOfValiable/class= new className();
		double  no=maths.max(5,7);
		
	}
}
class Maths
{
 public void max(double x, int y)
	{
		System.out.println("integr version called");
			
	}
	public void max(int x, double y)
	{
		System.out.println("double version called");
	}
}
