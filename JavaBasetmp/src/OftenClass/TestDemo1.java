package OftenClass;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class TestDemo1 {

	public static void main(String[] args) {
		StringBuffer sBuffer=new StringBuffer("菜鸟教程:");
		sBuffer.append("www");
		sBuffer.append(".runoob");
		sBuffer.append(".com");
		//sBuffer.reverse();   //将此字符序列用其反转形式取代
		//sBuffer.capacity();
		System.out.println(sBuffer);
		StringBuffer s=sBuffer;
		System.out.println(s);
		System.out.println(sBuffer.length());
		System.out.println(sBuffer.capacity());   //返回当前容量。
		System.out.println(sBuffer.charAt(1));   //返回此序列中指定索引处的 char 值。
		//sBuffer.setLength(10);   //重新设置字符串长度
		//System.out.println(sBuffer.length());
		//System.out.println(sBuffer.setCharAt(2,"sha");   //报错的原因不明
		System.out.println(sBuffer.toString());
		System.out.println(sBuffer.equals(s));//equals比较的是内容
		
		Integer i=new Integer(15);//装箱操作，基本类型变为包装类
		int temp=i.intValue();//拆箱，包装类变为基本类型
		System.out.println(temp*temp);
		
		String str="true";
		boolean flag=Boolean.parseBoolean(str);
		if (flag) {
			System.out.println("对的");
		} else {
			System.out.println("错的");
		}
		int x =100;
		String str1 = new String();
		//String str1=String.valueOf(x);//int变为String类型
		System.out.println(str1.toString());
		String str2 = x + ""; //任何数据类寻根与字符串相加之后就是字符串
		System.out.println(str2);
		
		System.out.println(System.getProperties());//获得当前虚拟机的环境属性
		System.out.println(System.currentTimeMillis());//返回自1970年1月1日0点至今的时间，属于long型
		
		/*Runtime r =Runtime.getRuntime();   //单例模式
		String str3 = "";   //定义一个字符串
*/		
		System.out.println(TimeZone.getDefault());
		
	}
}
