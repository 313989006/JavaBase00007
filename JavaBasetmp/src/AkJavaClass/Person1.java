package AkJavaClass;

public class Person1 {
	//声明变量: 属性
	String color = "黑色";
	String name;
	int age;
	public void talk(){
		System.out.println("我是 : "+ name + ", 今年 : " + age + "岁");
	}
	//构造方法
	void getMes(){
		System.out.println("定义类 ");
	}
	//主方法
	public static void main(String[] args) {
		Person1 a =new Person1();  //new一个Person1的对象
		System.out.println(a.color);  //调用color属性并赋值给a
		a.getMes();  //调用getMes方法
		Person1 p=new Person1();
		p.name="zhangsan";
		p.age= 20;
		p.talk();
	}
}
