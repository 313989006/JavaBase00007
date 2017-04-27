package OverLoadDemo;

class Person{
	String name;
	private int age;
	//含有一个整形参数的构造方法
	public Person (int age){
		name ="kehr";     //只提供一个参数，则用kehr初始化name
		this.age=age; 
	}
	//含有一个字符串类型的参数和一个整形参数的构造方法
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	//无参构造方法
	public Person(){
		
	}
	public void talk(){
		System.out.println("我叫 : "+ name + "我今年 : "+ age + "岁");
	}
}
public class ConstructOverLoad {
	public static void main(String[] args) {
		Person p1=new Person(23);
		Person p=new Person();   //有无参构造方法，才能实例化。
		Person p2=new Person("Tom", 24);
		p1.talk();
		p2.talk();
	}

}
