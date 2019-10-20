package jan2017.prob2.Polymorphism;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		
		double accountBalanceSum=0;
		for(Employee employee:emps){
			for(Account account:employee.getAccounts()){
				accountBalanceSum+=account.getBalance();
			}
			
		}
		//implement
		return accountBalanceSum;
	}
}
