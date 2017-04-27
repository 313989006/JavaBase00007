package com.ddb.javacore.ood;

public class TestAC {
	String name="张翠山";

	public void print() {
		String name = "张三丰";
		System.out.println(name);
	}

	public static void main(String[] args) {
		/*
		 * Administrator admin1 = new Administrator(); admin1.name = "张三";
		 * admin1.password = "123456"; admin1.show();
		 * 
		 * Administrator admin2 = new Administrator(); admin2.name = "李四";
		 * admin2.password = "98765"; admin2.show();
		 * 
		 * Customer customer = new Customer(); customer.core=100;
		 * customer.cardType="VIP"; customer.show();
		 */

		TestAC test = new TestAC();
		System.out.println("Test.name 的默认值 : " + test.name);
		test.print();
	}
}
