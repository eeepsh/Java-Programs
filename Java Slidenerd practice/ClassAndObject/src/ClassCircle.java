
public class ClassCircle 
{
	public static void main(String[] args) throws Exception
	{
		Circle c=new Circle();
		c.findArea(3.2);
		
		Circle c2=new Circle();
		c2.findArea(4.1);
	
		
		
	}

}
class Circle
{
	double radius;
	double area;
	
	public void findArea(double r)
	{
		radius=r;
		area=radius*radius*3.14;
		System.out.println(area);
	}
}
