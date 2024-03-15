package week6;

import java.util.Scanner;
public class demoSRPcalculator {
	public static void main(String[]args){
		double result=0;
		readInputValues input=new readInputValues();
		switch(input.operation){
			case '+' :
			result=Addition.sum(input);break;
			case '-' :
			result=Substraction.difference(input);break;
			case '*' :
			result = Multiplication.product(input);break;
			case '/' :
			result = Division.quotient(input);break;
			case '%' :
			result = Modulus.reminder(input);break;
			default:
			System.out.println("Enter valid choice....");break;
			       }
		if(result>0)System.out.println("the result is...."+result);
	}
}
class readInputValues{
	double num1,num2;
	char operation;
	readInputValues(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any non zero number....");
		num1=sc.nextDouble();
		System.out.println("Enter any non integer number....");
		num2=sc.nextDouble();
		System.out.print("Enter your choice...");
		operation=sc.next().charAt(0);
		sc.close();
	}
}
class Addition{
	public static double sum(readInputValues ip){
		return(ip.num1 + ip.num2);
	}
}
class Substraction{
	public static double difference(readInputValues ip){
		return(ip.num1 - ip.num2);
	}
}
class Multiplication{
	public static double product(readInputValues ip) {
		return(ip.num1 * ip.num2);
	}
}
class Division{
public static double quotient(readInputValues ip) {
		return(ip.num1 / ip.num2);
    }
}
class Modulus{
public static double reminder(readInputValues ip){
		return(ip.num1 % ip.num2);
	}
}
