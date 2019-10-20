
public class PolymorphismInterface 
{
	public static void main(String args[])
	{ 
		Measurable measurable=new Rectangle(10, 10);
		
		Rectangle r1=new Rectangle(10,20);
		Rectangle rect=(Rectangle)measurable;
		rect.display();
		Circle c1=new Circle(10);
		addArea(r1, c1);
		System.out.println(measurable.getPerimeter());
		
		
	}
	public static void addArea(Measurable m1, Measurable m2)
	{
		double sumOfArea=m1.getArea()+m2.getArea();
		System.out.println(sumOfArea+ " meter square   is the total  area");
	}
	
}
 interface Measurable
 {
	 float pi=3.14F;
	 
	 public double getPerimeter();
	 public double getArea();
 }
 
 
 class Rectangle implements Measurable
 {
	 int breadth, length;
	 
	 public void display()
	 {
		 
	 }
	 
	 public Rectangle(int i, int j) 
	 { 
		 breadth=i;
		 length=j;
	 
		// TODO Auto-generated constructor stub
	}

	public double getPerimeter()
	 {
		 return 2*(length + breadth);
	 }

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*breadth;
	}
 }
 
 class Circle implements Measurable
 {
	 int radius;
	
	 public Circle(int r)
	 {
		 r=radius;
	 }
	
	 public double getPerimeter()
	 {
		 return 2*pi*radius;
	 }

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 2*pi*radius*radius;
	}
	 
 }
 
 
 
 
 
 
 
 
 
 
 
 