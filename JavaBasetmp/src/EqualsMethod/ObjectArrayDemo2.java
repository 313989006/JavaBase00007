package EqualsMethod;
		//使用Object接收任意引用数据类型对象
public class ObjectArrayDemo2 {

	public static void main(String[] args) {
		//定义数组
		int tmp[] ={1,3,5,7,9};
		//使用Object接收数组
		Object obj = tmp;
		print(obj);//调用print()方法
	}
	public static void print(Object o) {
		//判断o是不是整数数组
		if (o instanceof int[]) {
			int[] x = (int[]) o;   //声明一个数组，
			for (int i = 0; i < x.length; i++) {
				System.out.print(x[i] + "\t");
	}
		}
	}
}
