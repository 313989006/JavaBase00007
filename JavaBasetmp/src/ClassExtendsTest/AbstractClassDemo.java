package ClassExtendsTest;
	//抽象类
	abstract class Person6{
		String name;
		int age;
		String occupation;
		//抽象类中的抽象方法speak()
		public abstract String speak();
	}
	//Student6类继承Person6，实现抽象方法speak()
	class Student6 extends Person6{
		public Student6(String name,int age,String occupation) {
			this.name=name;
			this.age=age;
			this.occupation=occupation;
		}
		//实现抽象方法
		public String speak() {
			return "学生---姓名   " + this.name+ ",年龄" + this.age + ",职业" + this.occupation;
		}
	}
	//Worker类继承Person6类，实现抽象方法speak()
	class Worker extends Person6{
		public Worker(String name,int age,String occupation){
			this.age=age;
			this.name=name;
			this.occupation=occupation;
		}
		//
		public String speak() {
			return "学生---姓名   " + this.name+ ",年龄" + this.age + ",职业" + this.occupation;
		}
	}
public class AbstractClassDemo {
	public static void main(String[] args) {
		Student6 s6=new Student6("张三", 20, "学生");
		Worker wk =new Worker("李四", 30, "工人");
		System.out.println(s6.speak());
		System.out.println(wk.speak());
	}
}
