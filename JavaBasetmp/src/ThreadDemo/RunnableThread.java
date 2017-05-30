package ThreadDemo;
	//使用Runnable接口实现多线程使用实例，结果不唯一
public class RunnableThread {

	public static void main(String[] args) {
		TestThread2 t=new TestThread2();
		new Thread(t).start();//使用Thread类的方法启动线程
		for (int i = 0; i < 5; i++) {
			System.out.println("main 线程在运行！");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class TestThread2 implements Runnable{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("TestThread2在运行！");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
