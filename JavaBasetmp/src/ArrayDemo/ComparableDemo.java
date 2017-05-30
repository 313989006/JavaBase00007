package ArrayDemo;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


class Book implements Comparable<Book> {
	private String title;
	private double price;

	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}

	public String toString() {
		return "书名是:" + this.title + ",价格是:" + this.price + "\n";
	}

	@Override
	public int compareTo(Book o) {
		/*//按照正常顺序排列
		if (this.price>o.price) {
			return 1;
		} else if (this.price<o.price) {
			return -1;
		}else{
			return 0;
		}*/
		
		//倒着排序
		if (this.price<o.price) {
			return 1;
		} else if (this.price>o.price) {
			return -1;
		}else{
			return 0;
		}
	}
}

public class ComparableDemo {

	public static void main(String[] args) {
		List<Book> bookList=new ArrayList<Book>();
		bookList.add(new Book("Oracle", 60));
		bookList.add(new Book("Java", 69.8));
		bookList.add(new Book("Java Web", 59.8));
		bookList.add(new Book("Android", 58));
		//实现comparable接口进行排序
		Object object[]=bookList.toArray();
		//为数组排序
		Arrays.sort(object);
		System.out.println(Arrays.toString(object));
		
		/*//comparator实现对象数组排序
		Book book[]=new Book[]{
				new Book("Oracle", 60),
				new Book("Java", 69.8),
				new Book("Java Web", 59.8),
				new Book("Android", 58)
		};
		Arrays.sort(book,new BookComparator());//为对象数组排序,需要新建一个BookComparator类
		System.out.println(Arrays.toString(book));*/
	}
}
