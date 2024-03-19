package bouns;

import emp.Employee;
public class issueBouns {

	public static void issueEmployeeBouns(Employee emp) {
		if(emp.expYears>10)
			emp.salary=emp.salary+(emp.salary * 0.15f);
		else
			emp.salary=emp.salary+(emp.salary * 0.05f);

	}

}