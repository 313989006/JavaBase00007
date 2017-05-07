package ClassExtendsTest;

		//动态多态的使用
public class FunPoly {
	void sum(int i){
		System.out.println("数字之和是 : " + i);
	}
	void sum(int i,int j){
		System.out.println("数字之和是 : " + (i + j));
	}
	public static void main(String[] args) {
		//实例化一个对象，然后用实例化对象调用静态方法
		FunPoly demo=new FunPoly();
		demo.sum(5);
		demo.sum(5, 10);
	}
}
