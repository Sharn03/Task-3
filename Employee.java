package TASK_3;
//As Taxable is an interface we have to implement it another Class
public class Employee implements Taxable {
//Declaring the Attributes of the class Employee
private int empID;
private String name;
private int salary;
private double ans;

//Initializing the Data member via Set method
// In-order to retrieve the data we have to get via get method
public int getEmpID() {
	return empID;
}


public void setEmpID(int empID) {
	this.empID = empID;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getSalary() {
	return salary;
}


public void setSalary(int salary) {
	this.salary = salary;
}
//here we are implementing the abstract class calctax of interface taxable
public double calcTax()
{
	ans =  incomeTax*salary/100;
	return ans;
	
}
}
