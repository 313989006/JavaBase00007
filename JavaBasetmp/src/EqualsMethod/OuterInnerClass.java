package EqualsMethod;

class InnerClassTest {
	int score = 95;

	void inst() {
		class Inner {
			void display() {
				System.out.println("成绩是:" + score);
			}
		}
		System.out.println("**********");
		Inner in = new Inner();
		in.display();
		System.out.println("#################");
	}
}

public class OuterInnerClass {

	public static void main(String[] args) {
		InnerClassTest outer = new InnerClassTest();
		outer.inst();
	}
}
