package EqualsMethod;
		//使用Object接收接口对象
interface A{
	 public String getInfo();
}
class B implements A{
	public String getInfo() {
		return "你好";
	}
}

public class ObjecInterfaceDemo {

	public static void main(String[] args) {
		A a =new B();//向上转型，为接口进行实例化，接口对象
		Object ob = a;//使用Object接收，向上转型,a是引用类型实例，可以用Object接收
		A x = (A)ob;//向下转型为接口类型
		//B y =(B)ob;
		System.out.println(x.getInfo());
		//System.out.println(y.getInfo());
	}

}
