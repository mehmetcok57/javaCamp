package oopIntro;

public class Product {
	public Product() {  //Constructor 1
		System.out.println("ben �al��t�m"); 
	} //constructor blo�u //public Producrt() biz yazmasakta var 
	
	public Product(int id,String name, double unitPrice, String detail) {//Constructor 2
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		//Kural 1 //Constructor �al��mak durumunda bu durumda sadece 1 �al���r  bu yada sadece 1 �al���r
		
		//ben �al��t�m 2 defa gelir
		//sebebi main b�l�m�de new Product(); 2 tanesinin bo� olmas� onlar�n defaut de�erinin gelmesi
		//ozaman parametsiz olan� �al��t�r diyece�iz this(); yazaca��z en ba�a �ne parametsiz olarak �al��t�racak
		//b�ylece Constructor da birbirini �a��t�rabiliriz
	}
	
	//programlama da ana krallar�ndan biri DONT REPEAT YOURSELF �FADES� KEND�N� TEKRAR ETME
	
	//kod yazarken 5 b�y�k prensip SOLID
	
	
	int id;
	String name	;
	double unitPrice;
	String detail;
}
