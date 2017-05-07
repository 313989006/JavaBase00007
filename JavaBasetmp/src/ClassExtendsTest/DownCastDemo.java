package ClassExtendsTest;
	//演示子类和父类，向上转型，向下转型的关系
	class Annimal{
		public void print() {
			System.out.println("我是一个动物");
		}
	}
	class Bird extends Annimal{
		public void print() {
			System.out.println("我是一只小鸟");
		}
		//子类新扩充方法
		public void getBird() {
			System.out.println("需要一种特殊方法才能得到一只小鸟");
		}
	}
	//父类对象无法看到子类的新扩充方法
public class DownCastDemo {
	public static void main(String[] args) {
		Annimal annimal=new Bird();  //向上转型，通过子类实例化父类对象
		annimal.print();
		Bird bird = (Bird)annimal;  //向下转型，通过父类实例化子类对象，需要强制转换完成
		bird.getBird();
	}
}
