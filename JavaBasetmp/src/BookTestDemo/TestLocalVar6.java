package BookTestDemo;

public class TestLocalVar6 {

	public static void main(String[] args) {
		int x =10;
		int y =20;
		int result = x > y ? x:y;
		System.out.println("1st result = " + result);
		x=50;
		result = x > y ? x:y;
		System.out.println("2nd result = " + result);
}
}
