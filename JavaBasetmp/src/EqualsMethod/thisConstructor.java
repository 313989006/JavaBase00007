package EqualsMethod;
	//先执行无参构造方法，再执行有参构造函数
class Person2 {
	String name;
	int age;

	// 无参构造函数
	public Person2() {
		System.out.println("**************");
	}

	// 有参构造函数
	public Person2(String name, int age) {
		this();
		this.name = name;
		this.age = age;
		System.out.println("#######################");
	}
}

public class thisConstructor {

	public static void main(String[] args) {
		new Person2();
		new Person2("张三", 30);
		//new Person2().Person2();
	}
}
