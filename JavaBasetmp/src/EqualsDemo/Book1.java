package EqualsDemo;

public class Book1 {
	String title;
	int price;
	String pub;
	
	 public Book1(String title,int price,String pub) {
		this.title=title;
		this.price=price;
		this.pub="天天精彩出版社";
	}
	
	public String getInfo(){
		return "这本书是 : "+ title + "价格是 : "+ price + "出版社是 : "+ pub;
	}
}
