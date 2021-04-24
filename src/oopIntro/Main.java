package oopIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		//Product product1 = new Product(); //Örnek oluþturma, referans oluþturma(endoðu anlam bu), intance oluþturma deniyor
		Product product1 = new Product(1,"Lenova V14", 15000, "16 GB RAM"); //DÝÐER YAZMA YÖNTEMÝ
		//Product.java da this yazdýðýmýz alanlar aslýnda Product.java daki class ý belirler
		product1.id=1;
		product1.name="Lenovo V14";
		product1.unitPrice =15000;
		product1.detail="16 GB RAM";
		
		
		Product product2 = new Product(); 
		product2.id=2;
		product2.name="Lenovo V15";
		product2.unitPrice =16000;
		product2.detail="32 GB RAM";
		
		Product product3 = new Product(); 
		product3.id=3;
		product3.name="Hp 15";
		product3.unitPrice =10000;
		product3.detail="8 GB RAM";
		
		Product [] products = {product1,product2,product3}; //products çoðul kullanýlýyorsa dizidir
		for (Product product : products) {
			
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		//snippet açmayý öðren sys ctrl + space
		
		Category categorty1 = new Category();
		categorty1.id =1;
		categorty1.name ="Bilgisayar";
		
		Category categorty2 = new Category();
		categorty2.id =1;
		categorty2.name ="Ev Bahçe";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
		
		


		
	}
}
