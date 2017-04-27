package AkJavaClass;


public class MethodAddDemo {
	
	//非递归方式实现计算1+2+...+n
	public int addNonRecursion(int n){
		int result =0;
		for (int i = 0; i <=n; i++) {
			result += i;
		}
		return result;
	}
	//递归方法实现计算1+2+...+n
	//递归通过对方法本身的压栈和弹栈的方式，将每一层的结果逐级返回，通过逐步累加求的结果
	public int addNonRecursion1(int m) {
		if (m <= 1) {
			return m;
		}
		return m + addNonRecursion1(m-1);
	}
	public int addNonRecursion2(int x) {
		if (x<=1) {
			return x;
		}
		return x + addNonRecursion(x-1);
	}
	
	
	public static void main(String[] args) {
		MethodAddDemo mad=new MethodAddDemo();
		int result= mad.addNonRecursion(100);
		System.out.println("非递归方式实现计算结果 = " + result);
		
		int result1=mad.addNonRecursion1(5);
		System.out.println("递归方式计算实现结果 = "+ result1);
	}

}
