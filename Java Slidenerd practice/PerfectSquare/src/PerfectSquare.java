
public class PerfectSquare
{
	public static void main(String[] args)
	
	{
		for(int i=1; i<=100; i++)
		{
			int no=i;
			double root=Math.sqrt(no);
			
			if (root==Math.ceil(root))
			{
				System.out.println(no + " is a Perfect Square");
			}
			
			else
			{
				System.out.println(no + " is not a Perfect Square");
			}
		}
	}
}


