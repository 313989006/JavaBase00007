package EqualsMethod;

public class Person {
	/*int id;
	String name;
	public Person(int id,String name) {
		this.id = id;
		this.name = name;
	}
	//重写hashCode方法(重写equals()方法也必须重写hashCode()方法)
	public int hashCode() {
		return id*(name.hashCode());
	}
	//重写equals方法
	public boolean equals(Object o) {
		Person p=(Person) o;
		return (this.id ==p.id)&&(this.name.equals(name));
	}*/
	
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//重写equals()方
	public boolean equals(Object o) {
		//声明一个布尔型变量并初始化
		boolean tp = true;
		Person p = this;
		//判断Object类对象是否是Person的实例
		if (o instanceof Person) {
			//如果是Person的实例，则进行向下转型
			Person p2 = (Person) o;
			if (!(p.name.equals(p2.name)&&p.age ==p2.age)) {
				tp = false;
			}
		} else {
			//如果不是Person的实例，则直接返回false
				return false;
		}
		return tp;
	}
}