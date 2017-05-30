package TestValueDemo;
public class TestValue {
	/*//在函数中基本数据类型的传递
	public static void change(int i,int j) {
		int temp = i;
		i = j;
		j =temp;
	}
	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		change(a, b);
		System.out.println(" a = " + a );
		System.out.println(" b = " + b );
	}*/
	//传递引用数据类型
	public static void change(int[] count) {
		count[0] = 0;
		System.out.println("在方法内部count[0] = "+ count[0]);
	}
	public static void main(String[] args) {
		int[] count={1,2,3,4,5};
		System.out.println("方法执行前的count[0] = " + count[0]);
		change(count);
		System.out.println("方法执行后的count[0] = "+ count[0]);
	}
}
