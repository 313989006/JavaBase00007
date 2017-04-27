package com.ddb.javacore.ood5;

public class TestRefDemo {

	public static void main(String[] args) {
		Student student1 = new Student("张三");
		Student student2 = new Student("张三");
		if (student1==student2) {
			System.out.println("student1和student2==相等");
		} else {
			System.out.println("student1和student2==不相等");
		}
		if (student1.equals(student2)) {
			System.out.println("student1和student2 equals相等");
		} else {
			System.out.println("student1和student2 equals不相等");
		}
	}
}
