package com.ddb.javacore.ood;

public class TestLion {

	public static void main(String[] args) {
		AutoLion lion = new AutoLion();
		System.out.println(lion.showLion());
		lion.run();
		System.out.println(lion.bark());
	}
}
