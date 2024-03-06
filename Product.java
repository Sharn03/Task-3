package TASK_3;

public class Product implements Taxable {
private int Pid;
private int Price;
private int Quantity;
private  double ans ;
public int getPid() {
	return Pid;
}
public void setPid(int pid) {
	Pid = pid;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}


public double calcTax()
{
	ans = (salesTax*Price)/100;
	return ans;
	}
}
