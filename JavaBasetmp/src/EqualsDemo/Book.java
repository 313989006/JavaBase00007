package EqualsDemo;

public class Book {
	String title;
	int price;
	public Book(String title, int price) {
		this.title=title;
		this.price=price;
		/*Book bookA=new Book("寂寞天使",50);
		Book bookB=new Book("Java必备",60);*/
	}
	public String printfo(){
		return "这本书名是  : "+  this.title+ " ,价格是 "+ this.price;
	}

}
