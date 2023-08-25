package oopIntro;

public class Product {
	public Product() {	//Constructor
		System.out.println("product constructor text");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this();
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
