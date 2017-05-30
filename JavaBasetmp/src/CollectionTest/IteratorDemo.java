package CollectionTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//通过迭代方法访问类集
public class IteratorDemo {

	public static void main(String[] args) {
		// 创建一个ArrayList数组
		ArrayList<String> al = new ArrayList<String>();
		// 加入到ArrayList中
		al.add("Welcome");
		al.add("to");
		al.add("Anhui");
		// 使用Iterator显示al中的内容
		System.out.println("al中的内容是：");
		Iterator<String> str = al.iterator();
		while (str.hasNext()) {
			Object element = (Object) str.next();
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.println("***********************");
		
		//通过双向迭代方法访问类集
		// 下面是将列表中的内容反向输出
		System.out.println("将列表内容反向输出");
		ListIterator<String> lit = al.listIterator();
		while (lit.hasNext()) {
			Object element = (Object) lit.next();
		}

		while (lit.hasPrevious()) {
			Object element = lit.previous();
			System.out.print(element + " +");
		}
		System.out.println();
	}
}
