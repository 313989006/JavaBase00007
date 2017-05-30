package StringDemo;
	//P432  实战练习
public class ExerciseDemo {

	public static void main(String[] args) {
		String a = "ab";
		String b = "a" + "b";
		System.out.println(a == b);
		String a1 = "ab";
		String b1 = "cd";
		String c = "abcd";
		String c1 = "ab" + "cd";
		String d = a1 + b1;
		System.out.println(c.equals(d));
		System.out.println(c1.equals(c));
	}
}
