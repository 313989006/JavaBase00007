package ArrayDemo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
	//	数组操作类Arrays排序及二分法查找方法的使用：Arrays.binarySearch(参数,参数)
public class ArrayTestDemo2 {

	public static void main(String[] args) {
		int arrInt[]={17,40,12,6,15,16,8,10,18,50};
		//按照升序排序数组
		Arrays.sort(arrInt);
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入需要查找的整数");
		//获取输入的整数
		int search =scan.nextInt();
		//输出排序后的数组		
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]+"");
		}
		System.out.println();
		//利用二分查找法查找指定的整数
		int seaInt=Arrays.binarySearch(arrInt, search);
		if (seaInt>=0) {
			System.out.println(search + "是数组的第"+ (seaInt+1)+"位元素");
		} else {
			System.out.println(search+"不是数组的元素");
		}
		scan.close();//关闭输入流
	}

}
