
public class Polymorphism 
{
	public static void main(String args[])
	{ 
		Animal a=new Human();
		Human h=new Human();
		a .move();
		
	}

}
class Animal
{
	public void move()
	{
		System.out.println("moving animal from one place to another");
	}
}

class Human extends Animal
{
	public void move()
	{
		System.out.println("animal with brain");
		//super.move();
	}
}
