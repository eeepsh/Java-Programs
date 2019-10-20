package Nov2016.polymorphism;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		double sumOfSalaries=0;
		for(EmployeeData employeeData:aList){
			sumOfSalaries=sumOfSalaries+employeeData.getSalary();
		}
		
		return sumOfSalaries;
		//implement
		//compute sum of all salaries of people in aList and return
	}
}
