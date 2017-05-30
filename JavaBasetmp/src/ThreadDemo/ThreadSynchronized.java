package ThreadDemo;

public class ThreadSynchronized {

	public static void main(String[] args) {
		TestThread t=new TestThread();
		//启动四个线程，实现资源共享
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}
}
