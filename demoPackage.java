package week6;

import emp.Employee;
import bouns.issueBouns;
public class demoPackage {

	public static void main(String[] args) {
		System.out.println("this program illustrates use of packages...");
		Employee list[]=new Employee[3];
		for(byte i=0;i<list.length;i++)
			list[i]=new Employee();
		System.out.println("\n**");
		System.out.println("empId\tempName\texpYears\tsalary");
		System.out.println("\n**");
		for(byte i=0;i<list.length;i++) {
			issueBouns.issueEmployeeBouns(list[i]);
			list[i].getEmployee();
		}
		System.out.println("");
	}

}