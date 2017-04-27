package AkJavaClass;

import sun.net.www.content.text.plain;

public class NoNameObject {
	/*//创建匿名对象并调用方法
	public void say(){
		System.out.println("面朝大海,春暖花开!");
	}
	public static void main(String[] args) {
		//实例化类的一个对象，调用say方法
		NoNameObject s=new NoNameObject();
		s.say();
		//这是匿名对象，没有被其他对象所引用
		new NoNameObject().say();//直接实例化直接调用say方法
	}*/
	
	/*//equals比较方法
	public static void main(String[] args) {
		String str1=new String("神马");
		String str2=new String("神马");
		 String Str3=str2;
		 if (str1.equals(str2)) {
			System.out.println("str1 = str2 ");
		} else {
			System.out.println(" str1 != str2 ");
		}
		 if (str2 .equals(Str3)) {
			System.out.println(" str2 = str3 ");
		} else {
			System.out.println("str2 != str3 ");
		}
	}*/
	
	//对象数组的使用
	public static void main(String[] args) {
	Person1[] p=new Person1[3];
	p[0] =new Person1();
	p[1] =new Person1();
	p[2] =new Person1();
	for (int i = 0; i < p.length; i++) {
		p[i] =new Person1();
		System.out.println(p[i]);
	}
}
}
