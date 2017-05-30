package TestReflectDemo;

//会报错：Exception in thread "main" java.lang.ClassNotFoundException: Book3

class Book3 {
	private String title;
	private double price;
	public void setTitle(String title) {
		this.title =title;
	}
	public void getTitle(String title){
		this.title=title;
	}
	public void setPrice(double price) {
		this.price =price ;
	}
	public void getPrice(double price){
		this.price=price;
	}
	@Override
	public String toString() {
		return "书名是： " + this.title + "价格是 ： " + this.price;
	}
}

public class Test{
	public static void main(String[] args) throws Exception{
	//根据对象找到类
	Class<?> cl =Class.forName("Book3");
	System.out.println(cl);
	Book3 book3 =(Book3)cl.newInstance();
	book3.setTitle("安徽农业");
	book3.setPrice(98.7);
	System.out.println(book3);
}
}
