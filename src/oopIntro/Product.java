package oopIntro;

public class Product {
	public Product() {  //Constructor 1
		System.out.println("ben çalýþtým"); 
	} //constructor bloðu //public Producrt() biz yazmasakta var 
	
	public Product(int id,String name, double unitPrice, String detail) {//Constructor 2
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		//Kural 1 //Constructor çalýþmak durumunda bu durumda sadece 1 çalýþýr  bu yada sadece 1 çalýþýr
		
		//ben çalýþtým 2 defa gelir
		//sebebi main bölümüde new Product(); 2 tanesinin boþ olmasý onlarýn defaut deðerinin gelmesi
		//ozaman parametsiz olaný çalýþtýr diyeceðiz this(); yazacaðýz en baþa öne parametsiz olarak çalýþtýracak
		//böylece Constructor da birbirini çaýþtýrabiliriz
	}
	
	//programlama da ana krallarýndan biri DONT REPEAT YOURSELF ÝFADESÝ KENDÝNÝ TEKRAR ETME
	
	//kod yazarken 5 büyük prensip SOLID
	
	
	int id;
	String name	;
	double unitPrice;
	String detail;
}
