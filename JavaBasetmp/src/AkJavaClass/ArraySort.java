package AkJavaClass;

public class ArraySort {
	/*// 冒泡排序算法
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	//打印方法
	public static void printArr(int[] arr,String md) {
		System.out.println(md);
		for (int i : arr) {
			System.out.print( i + " ");
		}
		System.out.println();
	}
	//主方法，打印排序前后的数组
	public static void main(String[] args) {
		int[] arr={3,5,2,6,8,4,7};
		//int[] arr={3,5,2};
		printArr(arr, "排序前");
		sort(arr);
		printArr(arr, "排序后");
	}*/
	
	//利用Java的包库提供的方法排序
	public static void printArr(int[] arr,String md) {
		System.out.println(md);
		//for-each循环实现
	for (int i : arr) {
		System.out.print( i + " ");
	}
	System.out.println();
	}
	public static void main(String[] args) {
		int[] arr={3,5,2,6,8,4,7};
		printArr(arr, "排序前 : ");
		java.util.Arrays.sort(arr);  //利用Java的包库提供的方法排序，Arrays.sort默认的是升序
		printArr(arr, "排序后 : ");
	}
}
