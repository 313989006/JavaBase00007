package ClassExtendsTest;
	//方法的重写，子类重写父类的实现，重现talk方法
	//重写方法后，实例化对象调用talk方法，只能实现子类的talk方法
class Person4{
		String name;
		int age;
		public void talk() {
			System.out.println("我是 : " + name + ",我" + age + "岁");
		}
	}
	class Student4 extends Person4{
		String school;
		public Student4(String name,int age,String school) {
			//super(name,age);  //调用父类的构造方法，当属性值个数不同时，只能用super.name=name；
			super.name=name;
			super.age=age;
			this.name=name;
			this.age=age;
			this.school=school;
		}
		//子类中重写talk方法
		public void talk() {
			System.out.println("我在 " + school + "上学");
		}
	}
public class OverrideTestDemo {
	public static void main(String[] args) {
		Student4 sd=new Student4("Jack", 28, "安徽农业大学");
		sd.talk();
	}
}
