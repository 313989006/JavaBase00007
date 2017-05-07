package ClassExtendsTest;

	class Person3{
		private String name;
		private int age;
		public Person3(String name,int age) {
			this.name=name;
			this.age=age;
		}
		void setVar(String name,int age){
			this.name=name;
			this.age=age;
		}
		void print(){
			System.out.println("我是 : " + name + ", 我" + age + "岁" );
		}
	}
	class Student3 extends Person3{
		public Student3(String name,int age) {
			super(name, age);
		}
		/*void Test(){
			System.out.println("我是 : " + name + ", 我" + age + "岁" );
		}*/
	}
public class RestrictVisit {
	public static void main(String[] args) {
		//实例化对象并赋值
		Student3 sp=new Student3("叶叶", 15);
		//Student3 sx=new Student3("什么", 100);
		sp.print();
		//sp.print();
		sp.setVar("神舟十号", 30);
		sp.print();
	}

}
