package InterfaceTestDemo;
	//工厂模式
	interface Fruit{
		//定义一个水果标准
		public void eat();
	}
	class Apple implements Fruit{
		public void eat() {
			System.out.println("吃苹果: ");
		}
	}
	class Orange implements Fruit{
		public void eat() {
			System.out.println("吃橘子。");
		}
	}
	//实现类，定义方法，if-else判断子类对象的属性值
class Factory1 {
	//此类不需要维护属性的状态
	public static Fruit getInstance(String className) {
		if ("apple".equals(className)) {
			return new Apple();
		} 
		if ("orange".equals(className)) {
			return new Orange();
		}
		return null;
	}
}
public class Factory {
	public static void main(String[] args) {
		Fruit f =Factory1.getInstance("orange");   //初始化参数，(赋值为０)出现数组越界异常？
		f.eat();
}
}
