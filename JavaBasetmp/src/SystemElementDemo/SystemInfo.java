package SystemElementDemo;

import java.util.Enumeration;
import java.util.Properties;

public class SystemInfo {

	public static void main(String[] args) {
		/*Properties sp =System.getProperties();   //获得当前虚拟机的环境属性
		Enumeration e =sp.propertyNames();   //获得环境属性中所有的变量
		//循环打印出当前虚拟机的所有环境属性的变量和值
		while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			System.out.println(key + " = " + sp.getProperty(key));
		}*/
		
		//取得内存值
		Runtime runtime=Runtime.getRuntime();   //单例模式,通过静态方法获得正在运行的Runtime对象的引用
		String str ="";   //定义一个空字符串
		//通过循环产生垃圾
		for (int i = 0; i < 200; i++) {
			str =str + i;
		}
		//调用Runtime中的方法获取内存的使用情况，并输出
		System.out.println("1、最大可用内存 : " + runtime.maxMemory());
		System.out.println("2、总共可用内存 : " + runtime.totalMemory());
		System.out.println("3、最大可用内存 : " + runtime.freeMemory());
		runtime.gc();   //清除垃圾
		//输出清除垃圾之后的使用情况
		System.out.println("4、最大可用内存 : " + runtime.maxMemory());
		System.out.println("5、总共可用内存 : " + runtime.totalMemory());
		System.out.println("6、最大可用内存 : " + runtime.freeMemory());
	}
}
