package TestReflectDemo;
	//使用反射机制的工厂模式:捕捉到空指针异常

interface Book {
	public String getTitle();
}

class MathBook implements Book {
	@Override
	public String getTitle() {
		return "数学类图书";
	}
}

class ComputerBook implements Book {
	@Override
	public String getTitle() {
		return "计算机图书";
	}
}

class Factory {
	public static Book getInstance(String className) {
		Book book = null;
		try {
			book = (Book)Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}
}

public class FactoryDemo {

	public static void main(String[] args) throws Exception {
		Book book = Factory.getInstance("ComputerBook");
		System.out.println(book.getTitle());
	}
}
