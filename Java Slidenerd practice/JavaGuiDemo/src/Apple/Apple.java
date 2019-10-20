

package Apple;

import javax.swing.JOptionPane;

public class Apple {
 public static void main(String[] args)
 {
	// String pr=JOptionPane.showInputDialog("Hello i am deepa");
	 String fn=JOptionPane.showInputDialog("Enter first number");
	 String sn=JOptionPane.showInputDialog("enter second number");
	 
	// int text= Integer.parseInt(pr); 
	 int num1= Integer.parseInt(fn); 
	 int num2= Integer.parseInt(sn); 
	 
	 int sum=num1+num2;
	 
	 JOptionPane.showMessageDialog(null, "The answer is "+ sum, "The title", JOptionPane.PLAIN_MESSAGE);
 }
}
