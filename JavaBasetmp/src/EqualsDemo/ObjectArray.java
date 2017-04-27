package EqualsDemo;

public class ObjectArray {

	public static void main(String[] args) {
		Person[] p={
			new Person("张三", 30),
			new Person("李四", 40),
			new Person("王五", 50)
		};
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].talk());
		}
	}
}
