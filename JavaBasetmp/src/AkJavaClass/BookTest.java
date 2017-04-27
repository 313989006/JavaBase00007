package AkJavaClass;

public class BookTest {
	String title;
	int price;
	String pub="天天出版社";
	public void BookTest(String title,int price,String pub) {
		this.pub="天天出版社";
	}
	public void haha() {
		this.title=title;
		this.price=price;
		this.pub =pub;
	}
	public String printInfo() {
		return "这本书是 : "+this.title + ",价格是 : " + this.price + ",出版社是 "+ pub;
	}
	public static void main(String[] args) {
		BookTest bookA=new BookTest();
		BookTest bookB=new BookTest();
		BookTest bookC=new BookTest();
		bookA.title="共产党宣言";
		bookA.price = 70;
		bookB.title="国民党宣言";
		bookB.price=60;
		bookC.pub="每日精彩出版社";
		System.out.println(bookA.printInfo());
		System.out.println(bookB.printInfo());
		System.out.println(bookC.printInfo());
	}
}
