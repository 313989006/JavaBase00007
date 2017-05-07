package InterfaceTestDemo;

interface InterfaceA {
	public static final String INFO="Hello World"; //全局静态常量
	public abstract void print();  //无方法体的抽象方法
	/*default public void otherprint() {
		//带方法体的默认方法
		System.out.println("default methods");
	}*/
}
interface InterfaceB {
	public abstract void get();
}
