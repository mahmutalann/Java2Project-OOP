package oopIntro;

public class Product {
	public Product() {	//Creating Constructor
		System.out.println("product constructor text");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this(); //When using this function, the function equalizes to as belongs variable of the Product class' to the Product constructor block's variable.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail; 
	
}
