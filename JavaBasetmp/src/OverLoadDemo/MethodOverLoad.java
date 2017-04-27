package OverLoadDemo;


//方法的重载


public class MethodOverLoad {
	//计算两个整数之和
	public int add(int a,int b){
		return a+ b;
	}
	//计算两个单精度浮点数之和
	public float add(float a,float b){
		return a + b;
	}
	//计算三个整数之和
	public int add (int a,int b,int c){
		return a+ b+ c;
	}
	public static void main(String[] args) {
		int result;
		float result_f;
		MethodOverLoad test =new MethodOverLoad(); //实例化当前类的对象。
		
		//调用计算两个整数之和add函数
		result=test.add(1,2);
		System.out.println("a和b之和是 : "+ result);
	}
}
