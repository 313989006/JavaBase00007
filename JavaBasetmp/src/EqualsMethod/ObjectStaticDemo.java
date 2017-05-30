package EqualsMethod;

import EqualsMethod.StaticInnerClass.StaticInner;

class StaticInnerClass {
	private int propol = 5;
	private static int propol2 = 9;

	void display() {
		StaticInnerClass in = new StaticInnerClass();
		System.out.println("*******************");
	}

	static class StaticInner {
		private static int age;

		public void display() {
			// 静态内部类无法访问外部类的实例成员
			// System.out.println(propol);
			// 但是可以访问静态的
			System.out.println(propol2);
		}
	}
}

public class ObjectStaticDemo {

	public static void main(String[] args) {
		StaticInnerClass outer = new StaticInnerClass();
		StaticInner insect = new StaticInner();
		outer.display();
		insect.display();
	}

}
