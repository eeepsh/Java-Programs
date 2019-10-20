
public class OverriddingTest
{
	public static void main(String args[])
	{
		Cycle cycle =new Cycle();
		cycle.printInfo();
		
		Bycicle bycicle= new Bycicle();
		//System.out.println(bycicle.weight);
		//System.out.println(bycicle.brand);
		bycicle.printInfo();
		
	}

}
class Cycle
{
	int weight=10;
	
	public void printInfo()
	{
		System.out.println("super class "+weight);
	}
}
class Bycicle extends Cycle
{
	String brand="hero";
	
	public void printInfo()
	{
		System.out.println("sub class"+brand);
	}
}
