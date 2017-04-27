package com.ddb.javacore.ood4;

public class IDemoTest {

	public static void main(String[] args) {
		IStudent student = new StudentImpl();
		student.study();
		student.studyJava("Java");
		student.studyJava("PHP");
		student.studyJava("Python");
		

	}

}
