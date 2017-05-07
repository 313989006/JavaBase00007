package ClassExtendsTest;

	//重写父类的属性
	class book{
		//父类属性是字符串型
		String info ="安农,你好!";
	}
	class ComputerBook extends book{
		//子类中重新声明属性info并赋值
		//子类的info属性是整形
		int info = 200;
		//子类print方法
		public void print() {
			System.out.println(this.info);
			System.out.println(info);
			System.out.println(super.info);  //使用super调用父类的info属性
		}
	}
public class OverriddInfo {
	public static void main(String[] args) {
		//实例化Computer对象，调用print（）方法
		ComputerBook cb=new ComputerBook();
		cb.print();
	}
}
