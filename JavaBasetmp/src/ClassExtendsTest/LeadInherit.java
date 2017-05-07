package ClassExtendsTest;
		//使用继承和不使用继承的两种方法
	class Person{
		String name;
		int age;
		public Person(String name,int age) {
			this.name=name;
			this.age=age;
		}
		void speak(){
			System.out.println("我的名字是 : " + name + ", 我 " + age + "岁");
		}
	}
	class Student extends Person{
		//声明成员变量
		String name;
		int age;
		String school;
		Student(String name,int age,String school) {
			super(name, age);
			//实施本地初始化成员变量
			/*this.name=name;
			this.age=age;*/
			this.school=school;
		}
		/*void speak(){
			System.out.println("我的名字是 : " + name + ", 我 " + age + "岁");
		}*/
		void study(){
			System.out.println("我在  " + school + " 读 书");
		}
	}
public class LeadInherit {

	public static void main(String[] args) {
		//实例化一个student对象
		Student s =new Student("周君豪", 12, "祁集中学");
		s.study();
		s.speak();
		//实例化一个Person对象
		/*Person person=new Person("周君豪", 12);
		person.speak();
		Student student=new Student("叶叶", 15, "祁集中学");
		student.speak();
		student.study();*/
	}
}
