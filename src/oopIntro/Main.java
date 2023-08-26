package oopIntro;

public class Main {

	public static void main(String[] args) {  
	Product product1 = new Product(1, "Mac", 40000, "25 GB Ram"); //Örnek, Referans, Instance Oluşturma
		
		
		Product product2 = new Product();
		product2.id = 2;
		product2.name = "Iphone 12";
		product2.unitPrice = 25000;
		product2.detail = "128 GB Ram";
		
		Product product3 = new Product();
		product3.id = 3;
		product3.name = "Iphone 13";
		product3.unitPrice = 35000;
		product3.detail = "256 GB Ram";
		
		Product product4 = new Product();
		product4.id = 4;
		product4.name = "Iphone 14";
		product4.unitPrice = 45000;
		product4.detail = "512 GB Ram";
		
		Product [] products = {product1, product2, product3, product4};
		System.out.println(products[1].name);
		//for each 
		for(Product product : products) {
			
		System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Telefon";
		
		System.out.println(category1.name);
		System.out.println(category2.name);
		System.out.println(category1.id);

		ProductManager productManager = new ProductManager(){
		productManager.addToCart(product1);	
		productManager.addToCart(product2);	
		productManager.addToCart(product3);	

	}

}
