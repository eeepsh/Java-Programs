/* A costumer opens an account in a bank. the customer must have an initial balance of 100$ while
 * opening the account, the customer can withdraw, deposit and check his balance any time he wants,
 * the bank does not charge any fees for the 1st withdrawal but for all subsequent withdrawals,
 * the bank charges some transaction fees. the bank also calculates some certain amount of interest
 * on the amount deposited by customer as per its interest rate.
 * Create an object oriented program to automate this problem. 
 */
import java.io.*;
public class BankOperation
{ 
	public static void main(String args[])throws Exception
	{
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		int noOfCustomers=0;
		Bank bank=new Bank();
		Customer[] c= bank.getCustomer();
		
		
		
		while(true)
		{  
			System.out.println("Please enter your choice:");
			System.out.println("1: Add customer");
			System.out.println("2: Deposit money");
			System.out.println("3: Withdraw money");
			System.out.println("4: Check balance");
			System.out.println("5: Calculate interest");
			System.out.println("6: Exit");
			int choice=Integer.parseInt(bufferedReader.readLine());
			switch(choice)
			{
			case 1:
				System.out.println("Creating an account for a new customer:");
				System.out.println("Please enter the initial amount in your account");
				double bal=Double.parseDouble(bufferedReader.readLine());
				System.out.println("please enter your Account Number:");
				String acc=bufferedReader.readLine();
				Account account=new Account(bal, acc);
				System.out.println("Please enter your name:");
				String name=bufferedReader.readLine();
				Customer customer=new Customer(name, account);
				
				c[noOfCustomers]=customer;
				noOfCustomers++;
				System.err.println("Number of customers "+ noOfCustomers);
				
				for(int i=0; i<noOfCustomers; i++)
				{
					System.err.println(c[i].getName()+" Name");
				}
				
				break;
			case 2:
				System.err.println("Enter account number");
				acc=bufferedReader.readLine();
				if(noOfCustomers==0)
				{
					System.out.println("Account number is not found");
				}
				else
				{
					boolean found=false;
					for(int i=0; i<noOfCustomers; i++)
					{
						Account temp=c[i].getAccount();
						String accTemp=temp.getAccountNumber();
						
						if(accTemp.equals(acc))
						{
							System.out.println("Please enter the amount to deposit");
							double money=Double.parseDouble(bufferedReader.readLine());
							temp.deposit(money);
							found=true;
						}
						
					}
					if(found==false)
					{
						System.out.println("Account number is not found");
					}
				}
				break;
			case 3:
				System.err.println("Enter account number");
				acc=bufferedReader.readLine();
				if(noOfCustomers==0)
				{
					System.out.println("Account number is not found");
				}
				else
				{
					boolean found=false;
					for(int i=0; i<noOfCustomers; i++)
					{
						Account temp=c[i].getAccount();
						String accTemp=temp.getAccountNumber();
						
						if(accTemp.equals(acc))
						{
							System.out.println("Please enter the amount to withdraw");
							double money=Double.parseDouble(bufferedReader.readLine());
							temp.withdraw(money);
							found=true;
						}
						
					}
					if(found==false)
					{
						System.out.println("Account number is not found");
					}
				}
				break;
			case 4:
				System.err.println("Enter account number");
				acc=bufferedReader.readLine();
				if(noOfCustomers==0)
				{
					System.out.println("Account number is not found");
				}
				else
				{
					boolean found=false;
					for(int i=0; i<noOfCustomers; i++)
					{
						Account temp=c[i].getAccount();
						String accTemp=temp.getAccountNumber();
						
						if(accTemp.equals(acc))
						{
							System.out.println("Please enter the amount to deposit");
							System.out.println("Balance is "+temp.getBalance());
							found=true;
						}
						
					}
					if(found==false)
					{
						System.out.println("Account number is not found");
					}
				}
				break;
			case 5:
				System.err.println("Enter account number");
				acc=bufferedReader.readLine();
				if(noOfCustomers==0)
				{
					System.out.println("Account number is not found");
				}
				else
				{
					boolean found=false;
					for(int i=0; i<noOfCustomers; i++)
					{
						Account temp=c[i].getAccount();
						String accTemp=temp.getAccountNumber();
						
						if(accTemp.equals(acc))
						{
							bank.calculateInterest(c[i]);
							found=true;
						}
						
					}
					if(found==false)
					{
						System.out.println("Account number is not found");
					}
				}
				break;
			case 6:
				System.exit(0);
				break;
			default:
					break;
			
			}
			
		}
	}

}
class Bank
{
	private double interestRate=8.5;
	private double transactionFees=10;
	private Customer[] customers=new Customer[1000];
	
	/*
	 * ask with customer
	 * get the customers account
	 * get the account balance
	 * calculate interest amount in that balance and show that what can be their total
	 */
	
	public void calculateInterest(Customer customer)
	{
		Account a=customer.getAccount();
		double bal=a.getBalance();
		double interestAmount=bal*interestRate/100;
		double totalBalance=bal+interestAmount;
		System.out.println("Interest amount is : "+interestAmount +
				"total money after adding interest is:"+totalBalance);
	}
	public double getInterestRate()
	{
		return interestRate;
	}
	public double getTransactionFees()
	{
		return transactionFees;
	}
	public Customer[] getCustomer()
	{
		return customers;
	}
	
}
class Account
{
	private double balance=100;
	private String accountNumber;
	private boolean firstTime=true;
	
	public Account(String acc)
	{
		accountNumber=acc;
	}
	public Account(double bal, String acc)
	{
		if(bal>=100)
		{
			balance=bal;
		}
		else
		{
			balance=100;
		}
		accountNumber=acc;
	}
	/*
	 * @param howMuch, ask the user how much money to deposit
	 * if money is positive the add the money to the balance
	 * if the money is negative, tell the use that he/she can not enter negative amounts
	 */
	public void deposit( double howMuch)
	{
		if(howMuch>0)
		{
			balance=balance+howMuch;
			System.out.println(howMuch +"was succesfully deposited in your account." 
			+"the new balance is "+ balance );
			
		}
		else
		{
			System.err.println("please ensure the amount to be deposited is not negative");
		}
	}
	
	/*
	 * @param howMuch ask the user how much money to withdraw
	 * 	if it is the ist time user is trying to withdraw
	 *  		check if the money is positive
	 *  		if the money is negative tell the user, that they cannot perform the transaction
	 *  		if the money is positive
	 *  			check if the amount remaining in the balance after withdrawing is more than 100
	 *  			if yes, remove the money
	 *  			else tell the user about insufficient balance
	 *  
	 */
	public void withdraw(double howMuch)
	{
		if(howMuch>=0)
		{
			if (firstTime==true)
			{
				double tempBalance=balance;
				tempBalance=tempBalance-howMuch;
				
				if((tempBalance-howMuch)>=100)
				{
					balance=balance-howMuch;
					System.out.println("Withdrawal is successful and "+howMuch +" is withdrawan"+
					"remaining balance is "+balance);
				}
				else
				{
					System.err.println("insufficient amount of balance in account");
				}
				firstTime=false;
				
			}
			else
			{
				Bank bank=new Bank();
				
				double tempBalance=balance;
				tempBalance=tempBalance-howMuch-bank.getTransactionFees();
				
				if((tempBalance-howMuch)>=100)
				{
					balance=balance-howMuch-bank.getTransactionFees();
					System.out.println("Withdrawal is successful and "+howMuch +" is withdrawan"+
					"remaining balance is "+balance);
				}
				else
				{
					System.err.println("insufficient amount of balance in account");
				}
			}
		}
		else
		{
			System.err.println("please ensure the amount to be deposited is not negative");
		}
		
	}
	public double getBalance()
	{
		return balance;
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	
}
class Customer
{
	private String name;
	private Account account;
	
	Customer(String n, Account a)
	{
		 name=n; 
		 account=a;
	}
	public void display()
	{
		System.out.println("Name: "+name+ "Account balance : "+ account.getBalance() +"Balance : "
				+account.getBalance());
	}
	public String getName()
	{
		return name;
	}
	public Account getAccount()
	{
		return account;
	}
	
}
 
