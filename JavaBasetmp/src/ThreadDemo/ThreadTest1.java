package ThreadDemo;
	//同时激活多个线程
public class ThreadTest1 {

	public static void main(String[] args) {
		new TestThread1().start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main线程正在执行！");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//new TestThread1().start(); //如果在这里启动线程，main线程会先循环执行结束再执行TestThread线程
	}
}
	class TestThread1 extends Thread{
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println("TestThread1正在运行！");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		}
	}


