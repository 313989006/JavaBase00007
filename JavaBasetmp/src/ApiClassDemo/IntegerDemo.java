package ApiClassDemo;
	//使用包装类
public class IntegerDemo {
	public static void main(String[] args) {
		/*String a="123";   //定义一个字符串
		int i=Integer.parseInt(a);   //将字符串转化为整形
		//i++;
		for (int j=0; j <= 100; j++) {
			i=j;
			//System.out.println(j);
		}
		System.out.println(i);*/
		
		/*//使用包装类
		//基本类型变成包装类，装箱
		Integer x=new Integer(10);
		//包装类变为基本类型，拆箱
		int temp=x.intValue();
		int temp1=new Integer(30);   //直接转型并赋值
		System.out.println(temp*temp);
		System.out.println(temp1);
		System.out.println(temp1 - 10);
		*/
		/*//将字符串转变为double类型
		//先声明字符串，并赋值(字符串)
		String str="12.6";
		//将字符串转变为double类型，使用parseDouble()方法
		double x=Double.parseDouble(str);
		System.out.println(x);*/
		
		//将字符串转变为boolean类型
		/*String str="false";
		boolean bn=Boolean.parseBoolean(str);
		System.out.println(bn);
		if (!bn) {
			System.out.println("条件满足");
		} else {
			System.out.println("条件不满足");
		}*/
		
		/*//将基本类型转化为字符串,方法1
		int i=10;
		String str = i + " ";   //任何类型与字符串相加之后就是字符串
		System.out.println(str);
		//System.out.println(str.hashCode());
*/
		//将基本类型转换为字符串，方法2
		int x=197;
		String str=String.valueOf(x);
		System.out.println(str);
}
}
