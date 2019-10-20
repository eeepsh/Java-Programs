
public class ObejectOrientedProject
{
	public static void main(String[] args) throws Exception
	{
		Car myCar=new Car();
		myCar.fuelCapacity=20;
		myCar.amountOfFuel=2;
		myCar.addGas(29);
		System.out.println(myCar.amountOfFuel);
		myCar.mileage=20;
		
		myCar.drive(100);
		
	}

}
class Car
{
	double mileage;
	double amountOfFuel;
	double fuelCapacity;
	
	public void drive(double distance)
	{
		double fuelNeeded=distance/mileage;
		if(fuelNeeded<=amountOfFuel)
		{
			System.out.println("You can go on a trip");
		}
		else
		{
			System.out.println("Sorry you cant go on a trip");
		}
	}
	
	
	
	public void addGas(double amount)
	{
		double emptySpace=fuelCapacity-amountOfFuel;
		
		if(amount<=emptySpace)
		{
			amountOfFuel=amountOfFuel+amount;
			System.out.println(amount +" liters of fuel is added");
		}
		else
		{
			amountOfFuel=fuelCapacity;
			System.out.println("Now your tank is full");
		}
		
		
	}
	public double getFuelLevel(double x)
	{
		return amountOfFuel;
	}
	
}
