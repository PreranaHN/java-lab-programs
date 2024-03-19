package emp;

import java.util.Scanner;
public class Employee {
	short empId;
	public int expYears;
	String empName;
	public float salary;
	public Employee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee number...");
		empId=Short.parseShort(sc.next());
		System.out.println("enter employee name...");
		empName=sc.next();
		System.out.println("enter employee gross salary");
		salary=Float.parseFloat(sc.next());
		System.out.println("enter the employee years of experience...");
		expYears=Integer.parseInt(sc.next());
	}
	public void getEmployee() {
		System.out.println(empId+"\t"+empName+"\t"+expYears+"\t"+salary);
	}
	
}