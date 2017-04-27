package ThreadDemo;

public class TestThread implements Runnable{
	private int tickets=5;
	public void run(){
		while (true) {
			synchronized (this){
				if (tickets<=0) 
					break;
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "出售票" + tickets);
				tickets -=1;
			}
		}
	}

}
