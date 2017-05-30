package TestReflectDemo;
import java.lang.reflect.*;
import java.lang.reflect.Constructor;

//调用构造方法取得实例化对象
class BookOne {
	private String title;
	private double price;

	public BookOne(String title, double price) {
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return "图书名称:" + title + ",价格 ：" + price;
	}
}

public class TestInstance {

	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("BookOne");
		Constructor<?> cons = cls.getConstructor(String.class, double.class);
		BookOne bookOne = (BookOne) cons.newInstance("Java", 70.5);
		System.out.println(bookOne);
	}
}
