package Looping;

public class ArrayDemo 
{
	public static void main(String[] args)
	{
		int a=10;
		System.out.println(a);
		
		int[] x={3,5,8};
		System.out.println(x[0]);
		
		
		int[] y=new int[]{4,6,9};
		System.out.println(y[0]);
		
		int[] z= new int[3];
		z[0]=9;
		z[1]=10;
		z[3]=3;
		
		String[] color={"red", "blue", "black"};
		
		String[] country=new String[]{"nepal", "china","japan"};
		
		String[] city=new String[3];
		city[0]="ktm";
		city[1]="pkh";
		city[2]="patan";
		
		Object[] studentInfo=new Object[] {1,"ram","ktm",20};
		System.out.println(studentInfo[0]);
	}

}
