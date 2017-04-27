package AkJavaClass;

import java.util.Arrays;

public class ArrayMethod2 {
	//数组的== 和equals比较方法
	
	public static void printArr( int[] arr) {
		//for-each循环
		for (int i : arr) {
			System.out.print( i + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr={3,5,7,3,7,89,54,3,2,65,7};
		//int[] arrnew =arr;  //声明新数组，并把arr数组赋值给它。
		int[] arrnew=arr.clone();  //克隆出来新的数组
		System.out.println("arr : ");
		printArr(arr);
		System.out.println("arr.length = " + arr.length);
		System.out.println("---------------------");
		System.out.println("arrnew : ");
		printArr(arrnew);
		System.out.println( "arrnew.length = " + arrnew.length);
		System.out.println();
		//== 比较引用地址
		if (arr == arrnew) {
			System.out.println("两个数组的引用地址相同");
		} else {
			System.out.println("两个数组的引用地址不相同");
		}
		//利用object对象的equals方法实现对数组的比较
		if (Arrays.equals(arr, arrnew)) {
			System.out.println("两个数组相同");
		} else {
			System.out.println("两个数组不相同");
		}
		//数组不能直接用数值的equals比较方法
		/*if (arr.equals(arrnew)) {
			System.out.println("两个数组相同");
		} else {
			System.out.println("两个数组不相同");
		}*/
	}
}