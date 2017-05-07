package InterfaceTestDemo;

/*public class InterfaceAB implements InterfaceA{
	//实现ATest接口，必须实现接口里的print()方法
	public void print() {
		System.out.println("接口的抽象方法");
		System.out.println("INFO");
	}
	public static void main(String[] args) {
	//实例化子类对象
	InterfaceAB ab=new InterfaceAB();
	ab.print();   //调用实现过的抽象方法
	//ab.otherprint();   //调用接口中默认的抽象方法
	System.out.println(InterfaceAB.INFO);  //输出接口中的常量
	}
}*/
		//子类继承多个接口的使用
	class XY implements InterfaceA,InterfaceB{
		//实现两个接口里的两个方法print()和get()
		public void print() {
			System.out.println(INFO);
		}
		public void get() {
			System.out.println("你好啊! ");
		}
	}
	public class InterfaceAB{
		public static void main(String[] args) {
			XY xy=new XY();  //实例化子类对象
			InterfaceA a=xy;  //为父接口实例化
			InterfaceB b=xy;  //为父接口实例化
			a.print();
			b.get();
		}
	}
