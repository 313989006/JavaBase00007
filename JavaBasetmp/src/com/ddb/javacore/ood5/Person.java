package com.ddb.javacore.ood5;

public abstract class Person {
	static Student student = new Student("我是静态属性执行");
	String name;
	int age;
	
	public Person() {
		super();
		System.out.println("Person的无参构造函数被执行.....");
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Person的有参构造函数被执行...");
	}

	

}
