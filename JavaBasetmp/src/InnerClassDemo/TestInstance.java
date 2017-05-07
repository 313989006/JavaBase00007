package InnerClassDemo;

	class Person1{
		public void fun1(){
			System.out.println("1、第一个fun函数");
		}
		public void fun2(){
			System.out.println("2、第二个fun函数");
		}
	}
	//重写fun1()方法和fun2()方法
	class Student extends Person1{
		public void fun1(){
			System.out.println("3、第三个fun函数");
		}
		public void fun2(){
			System.out.println("4、第四个fun函数");
		}
	}
public class TestInstance {
	public static void main(String[] args) {
		//声明一个父类对象并通过子类对象对其实例化
		Person1 p6=new Student();
		//判断对象p6是否是Student的一个实例
		if (p6 instanceof Student) {
			//将Person1类的对象p6转型为Student类型
			Student st=(Student) p6;
			st.fun1();
		} else {
			p6.fun2();
		}
	}
}
