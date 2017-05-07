package RegExpDemo;
public class IntegerDemo {

	public static void main(String[] args) {
		//Integer类的三种创建方法
		/*Integer num1=new Integer(200);
		Integer num2=Integer.valueOf(200);
		Integer num3=300;
		System.out.println("三种不同的创建方式 : " + num1 + " " + num2 + " " + num3);*/
		
		//Boolean类的比较方式
		Boolean b1,b2;
		b1 =new Boolean(true);
		b2 =new Boolean(false);
		int res;
		res=b1.compareTo(b2);
		String str1 = "两个值相等";
		String str2 = "Object value is true";
		String str3 = "Argument value is true";
		//如果只有b1为true，res>0，如果只有b2为true，res<0,，否则res=0
		if (res == 0) {
			System.out.println(str1);
		} else if(res >0) {
			System.out.println(str2);
		}else if (res <0) {
			System.out.println(str3);
		}
	}
}
