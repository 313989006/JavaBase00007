package ClassExtendsTest;
	//多态
	class Person5{
		public void fun1() {
			System.out.println("*****fun1,我来自父类Person5");
		}
		public void fun2() {
			System.out.println("*****fun2,我来自父类Person5");
		}
	}
	
	class Student5 extends Person5{
		//重写fun1()方法
		public void fun1() {
			System.out.println("#####fun1,我来自子类Student5");
		}
		public void fun3() {
			System.out.println("#####fun3,我来自子类Student5");
		}
	}
public class Poly {
	public static void main(String[] args) {
		//此处，父类对象由子类实例化，实际上是对象的向上转型，不需要进行强制类型转换的，但是会丢失一部分精度
		Person5 p5 = new Student5();   // 声明的是一个子类无名对象 
		p5.fun1();  // 通过子类实例化的父类对象，调用重写的方法，指向的是子类重写之后的方法
		p5.fun2();
	}

}
