package com.ddb.javacore.ood2;

public class Person {
	private String name ="张三";
	private int age=(24);
	private char sex='F';
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		if (age <0) {
			return;
		} else {
			this.age = age;
		}
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

	public int getAge(){
		return this.age;
	}
	
	public void show(){
		System.out.println("name: " + name + "age" + age +"sex" + sex);
		
	}

}
