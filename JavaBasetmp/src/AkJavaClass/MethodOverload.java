package AkJavaClass;

/*		//加法方法的重载
public class MethodOverload {
	public int add(int a,int b) {
		return a + b;
	}
	public float add(float a,float b) {
		return a + b;
	}
	public int add(int a,int b,int c) {
		return a + b + c;
	}
	public static void main(String[] args) {
		int result;
		float result2;
		MethodOverload p=new MethodOverload();
		result=p.add(20, 40);
		System.out.println(result);
		
		result=p.add(10, 20, 50);
		System.out.println(result);
		
		result2=p.add(1.2f , 3.6f);
		System.out.println(result2);
	}

}
*/
public class MethodOverload{
		public MethodOverload(int x){
			int a = x;
			System.out.println("构造方法被调用 -----");
			System.out.println("a = " + a);
		}
		public void show(String msg) {
			System.out.println(msg);
		}
		private int a;;
		public static void main(String[] args) {
			MethodOverload ak=new MethodOverload(12);
			ak.show("构造方法的使用演示**********");
		}
		}

