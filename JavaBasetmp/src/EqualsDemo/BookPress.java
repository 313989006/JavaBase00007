package EqualsDemo;

public class BookPress {

	public static void main(String[] args) {
		
		Book1[] b={
			new Book1("生命", 19, "天天精彩出版社"),
			new Book1("Jva", 23, "天天精彩出版社"),
			new Book1("清纯", 54, "天天精彩出版社"),
		};
		/*Book1 b1=new Book1("声明", 21,);
		Book b2=new Book();
		Book b3=new Book();*/
		
		/*System.out.println(b1.getInfo());
		System.out.println(b2.getInfo());
		System.out.println(b3.getInfo());*/
		for (int i = 0; i < b.length; i++) {
			System.out.println (b[i].getInfo());
		}

	}

}
