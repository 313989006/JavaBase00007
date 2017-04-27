package com.ddb.javacore.ood;

public class InitialStudent {

	public static void main(String[] args) {
		Student student = new Student();
		student.name = "张三";
		student.age =20;
		student.classNo = "旅管1班";
		student.hobby = "足球";
		student.show();
	}

}
