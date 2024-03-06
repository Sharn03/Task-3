package TASK_3;

import java.util.Scanner;

public class Driver_Main {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	//Creating object for Employee class
	Employee emp =  new Employee();
	//Getting user-input 
	System.out.println("Enter the Employee ID");
	emp.setEmpID(s.nextInt());
	System.out.println("Enter the Employee name");
	emp.setName(s.next());
	System.out.println("Enter the Employee salary");
	emp.setSalary(s.nextInt());
	System.out.println("Income Tax of the Employee on yearly salary:"+" "+ emp.calcTax());
	System.out.println();
	//Creating object for Product class
	Product prdt = new Product();
	//Getting the user input for Data member of product class
	System.out.println("Enter the Product ID");
	prdt.setPid(s.nextInt());
	
	System.out.println("Enter the Product Price");
	prdt.setPrice(s.nextInt());
	
	System.out.println("Enter the Product Quantity");
	prdt.setQuantity(s.nextInt());
	
	System.out.println("Sales Tax on the unit price of the Product:"+" "+ prdt.calcTax());
	s.close();
}
} /* OUTPUT */
//Enter the Employee ID
//1
//Enter the Employee name
//Gautam
//Enter the Employee salary
//1000
//Income Tax of the Employee on yearly salary: 105.0
//
//Enter the Product ID
//2
//Enter the Product Price
//120
//Enter the Product Quantity
//3
//Sales Tax on the unit price of the Product: 8.4