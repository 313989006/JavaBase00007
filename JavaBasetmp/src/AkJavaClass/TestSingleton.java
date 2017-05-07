package AkJavaClass;
		//单例设计模式
class Singleton{
	private static Singleton instance = new Singleton();
	private Singleton() {
	}
	static Singleton getInstance() {
		return instance;
	}
	public void print() {
		System.out.println("合肥，你好");
	}
}
public class TestSingleton {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.print();
	}
}
