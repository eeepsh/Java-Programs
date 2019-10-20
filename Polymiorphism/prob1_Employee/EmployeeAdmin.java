package prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums)
	{
		//IMPLEMENT
		List<Employee> desiredEmployee= new ArrayList<>();// employye ko list banako
		Set k= table.entrySet();// set banara euta ssn ko euta set ma rakhna lai table nai banako
		Iterator it= k.iterator();//for loop jastai itteration garera sabai list read garna lai via sets
		while(it.hasNext())
		{
			Map.Entry m= (Map.Entry) it.next();// individual set read garda each set lai buffer ma store gareko
			String sr= (String) m.getKey();// tyo set ko key value lai ligeko
			Employee x=(Employee) m.getValue();//key ko corresponding employe lai employee x ma rakheko
			for(int i=0;i<socSecNums.size();i++){//aba each ma ssn cha ki nai herna ra givn condition check garna each ko
				if(sr.equals(socSecNums.get(i))&&x.getSalary()>80000)// sab ko ssn tanera tesko corresponding salaray get garera condition aplly gareko
				{
					desiredEmployee.add(x);// afule banako temporary object desiredemploye ma add gareko
				}
				
			}
			
			}
		Collections.sort(desiredEmployee,namComp);//collection use garera sort gareko desiredemploye argument sort gareko ssn comparision ko adhar ma jun chai functio
		
		return desiredEmployee;
		
	}
	
	public static final Comparator<Employee> namComp=new Comparator<Employee>(){
		public int compare(Employee e1, Employee e2){//
			return e1.getSsn().compareTo(e2.getSsn());
		}
		
	};
	
}
