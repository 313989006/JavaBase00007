package com.ddb.javacore.ood4;

public class TestDemoC {

	public static void main(String[] args) {
		IDemoC demoC = new DemoImpl();
		demoC.printAA();
		demoC.printBB();
		demoC.printCC();
	}
}
