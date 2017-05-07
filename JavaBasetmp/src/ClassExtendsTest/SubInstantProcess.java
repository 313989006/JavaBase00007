package ClassExtendsTest;

	//子类对象的实例化
	class Person1{
		String name ="张三";
		int age=28;
		//父类的构造方法
		public Person1() {
			System.out.println("*****父类构造 : 1.publicPerson()");
		}
	}
	//子类的构造方法
	class Student2 {
		String school;
		public Student2(){
			System.out.println("######子类构造 : 2.publicStudent()");
		}
	}
public class SubInstantProcess {
	public static void main(String[] args) {	
		//实例化Student的这个子类对象s，默认调用Person1()方法
		//Person1 p=new Person1();
		Student2 s=new Student2();
		System.out.println(s);
		//System.out.println(p);
	}
}
