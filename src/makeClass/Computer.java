package makeClass;

public class Computer {
	int price;
	String company;
	String size;
	
	public Computer (int price, String company, String size) {
		this.price = price;
		this.company = company;
		this.size = size;
	}
	
	public String toString() {
		return "Computer [price = " + price + ", Made by " + company + ", Size : " + size +"inch]";
	}
}
