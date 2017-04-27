package OverLoadDemo;

public class RecursionMethod {
	//非递归方式实现计算“1+2+3+...+n”
	public int addNonrecursion(int n){
		int result =0;
		for (int i = 0; i <= n; i++) {
			result+= i;
		}
		return result;
	}

	//递归方式实现计算“1+2+3+...+n”
	public int addRecursion(int m){
		//递归出口，当n小于1时函数就会逐层返回
		if (m<=1) 
			return m;
		return m+ addNonrecursion(m-1);
	}
	
	//主方法
	public static void main(String[] args) {
		
		RecursionMethod test=new RecursionMethod();
		//调用非递归方法计算
		test.addNonrecursion(10);
		System.out.println("1到10的和是 : " + test.addNonrecursion(10));
		//调用递归方法计算
		test.addRecursion(10);
		System.out.println("1到10的和是 : " + test.addRecursion(10));
	}
}
