package EqualsMethod;

import lombok.ToString;

class Person1 extends Object{
	String name="赵四";
	int age=30;
	//如果不重写toString方法，打印返回值是person1对象的信息！
	public String toString() {
		return "我是 : " + name + ",我 "+ age + "岁";
	}
}

public class ObiecToStingtDemo {
	public static void main(String[] args) {
	Person1 person1 =new Person1();
	System.out.println(person1);
	}

}
