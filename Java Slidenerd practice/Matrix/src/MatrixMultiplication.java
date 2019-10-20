import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MatrixMultiplication 
{
	public static void main(String args[])throws Exception
	
	{
		MatrixProduct a= new MatrixProduct();  // creating object a of class MatrixProduct
		a.multiply();                          //object calling the method multiply from class
	}
}
	class MatrixProduct
	{
		int a,b,c,d;
		int sum=0;
		public void multiply() throws Exception
		{
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));  //to take input in string form
		System.out.println("Enter the number of rows and column of first matrix : ");
		 int m=Integer.parseInt(br.readLine());  //reading the input string in integer form
		 int n=Integer.parseInt(br.readLine());
		  int matrixA[][]=new int[m][n];
		  
		  System.out.println("Enter the elements of first matrix : ");
		  for(c=0; c<m; c++)
		  {
		  
			  for(d=0; d<n; d++)
			  {
				  matrixA[c][d]=Integer.parseInt(br.readLine());
			
				  
			  }
		  }
		  
		  System.out.println("Enter the number of rows and column of second matrix : ");
			 int p=Integer.parseInt(br.readLine());
			 int q=Integer.parseInt(br.readLine());
			 int matrixB[][]=new int[p][q];
			 
			 System.out.println("Enter the elements of second matrix : ");
			 for(c=0;c<p;c++)
			 {
				 for(d=0;d<q;d++)
				 {
					 matrixB[c][d]=Integer.parseInt(br.readLine());
					 
				 }
				
			 }
			
			 
			 if (n==q)                    //comparing column of first matrix with row of second matrix
			 {
				 int productMatrix[][]= new int[m][q];
				 for(c=0;c<m;c++)
				 {
					 for(d=0; d<q; d++)
					 {
						 for(int k=0; k<p; k++)
						 {
							 sum = sum + matrixA[c][k]*matrixB[k][d];
						 }
						 
						 productMatrix[c][d] = sum;
			               sum = 0;
					 }
						 
				 }
				 
				 System.out.println("Product of two matrix is : ");
				 for(c=0;c<m;c++)
				 {
					 for(d=0; d<q; d++)
					 {
						 System.out.print(productMatrix[c][d] +"\t");
						 
					 }
					 System.out.println("\n");
					 
				 }
				
					 
						 
			 }
			 else
			 {
				 System.out.println("The multiplication is impossible: ");
			 }
				 
			 
			  


	} 
		 
		
		
		
	}


