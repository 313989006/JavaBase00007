package ClassExtendsTest;

import EqualsDemo.Book;

		//抽象类的特征
		//1、抽象类中可以有构造方法
		//2、抽象类不能使用final定义
		//3、static修饰，抽象类内外不同 
		//4、抽象类中可以没有抽象方法，但是即便没有抽象方法的抽象类也不能够直接在外部通过关键字new实例化

//验证static定义的内部抽象类
	abstract class Book6{
		public abstract void print();  // 抽象方法可以实现，也可以不实现
		//静态内部抽象类
		static abstract class CD{
			public abstract void get(); // 抽象方法get()
		}
	}
	//继承抽象类，必须要实现抽象类的方法
	class JavaCD extends Book6.CD{
		public void get() {
			System.out.println("安徽农业大学图书馆"); //抽象方法get()的实现
		}
	}
public class StaticAbStractClass {
	public static void main(String[] args) {
		//实例化对象
		Book6.CD ck=new JavaCD();
		ck.get();  //调用被实现过的方法，不能调用没有实现过的方法
	}
}
