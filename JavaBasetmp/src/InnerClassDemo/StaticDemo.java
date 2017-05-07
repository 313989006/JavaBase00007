package InnerClassDemo;

	class Person{
		//最后运行Person类里的无参方法体
		public Person(){
			System.out.println("1、第一个代码块被执行");
		}
		//第三个运行Person类里的static方法体
		static {
			System.out.println("2、第二个代码块被执行");
		}
	}
public class StaticDemo {
	//首先运行主类里的static方法体
	static{
		System.out.println("3、第三个代码块被执行");
	}
	public static void main(String[] args) {
		//其次运行主类里主方法里的方法体
		System.out.println("4、第四个代码块被执行");
		//产生Person类的两个匿名对象，并同时调用Person()方法
		new Person();
		new Person();
	}
}
