package ArrayDemo;

import java.util.Arrays;
import java.util.Random;

public class ArrayTestDemo1 {

	public static void main(String[] args) {
		//判断每个月有多少天
		/*int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < month.length; i++) {
			System.out.println("第" + (i + 1) + "月有" + month[i]+ "天" );
		}*/
		
		//声明数组并打印数组的长度和数值
		/*int[] a =new int[5];
		System.out.println("数组的长度是 : " + a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = "+ a[i]);
		}*/
		
		//上面修改得到
		/*Random r = new Random();
		int[] a = new int[r.nextInt(10)];//r.nextInt(10)返还0到10的随机整数
		int[] b ;
		b = a;
		
		System.out.println("数组a的长度是 : " + a.length);
		System.out.println("数组b的长度是 : " + b.length);
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100);//返还0到100的随机整数
			System.out.println("a[" + i + "] = "+ a[i] + "\t");
			System.out.println("b[" + i + "] = "+ b[i]);
		}*/
		
		//求数组中的最大值和最小值
		/*int[] x ={20,67,15,35,9};
		int max = x[0];
		int min = x[0];
		System.out.println("数组的元素包括 : " );
		//for循环遍历数组元素
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i] + " ");
			if (x[i] > max) {
				max = x[i];
			}else if (x[i] < min) {
				min = x[i];
			}
		}
		
		System.out.println(" 数组的最大值是 : " + max);
		System.out.println(" 数组的最小值是 : " + min);*/
		
		//数组排序 用Arrays.sort()
		/*int[] a ={25,24,12,76,98,101,90,28};
		System.out.println("排序前数组a的元素为 : " );
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] ="  + a[i] + "  ");
		}
		System.out.println();
		System.out.println("排序后数组a的元素为 : " );
		Arrays.sort(a);
		for (int j = 0; j < a.length; j++) {
			System.out.print("a[" + j + "] ="  + a[j] + "  ");
		}*/
		
		//随机生成一个数组，并排序
		Random r =new Random();
		int[] a =new int[r.nextInt(10)];
		System.out.println("排序前数组a的元素为 : " );
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100);
			System.out.print("a[" + i + "] ="  + a[i] + "  ");
		}
		System.out.println();
		//int b=new int[r.nextInt(8)];
		System.out.println("排序后数组a的元素为 : " );
		Arrays.sort(a);
		for (int j = 0; j < a.length; j++) {
			System.out.print("a[" + j + "] ="  + a[j] + "  ");
		}
		}
	}
