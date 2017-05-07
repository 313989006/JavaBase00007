package RegExpDemo;
import java.math.BigInteger;
		//大型整数操作类BigInteger
		//当对非常大的数字进行操作，但是超过了double 的范围，用BigInteger
public class BigIntegerDemo {
	public BigIntegerDemo(String string) {
		
	}
	public static void main(String[] args) {
		BigInteger bigA =new BigInteger("7978562739475386");
		BigInteger bigC =new BigInteger("7978562739475386");
		BigInteger bigB = new BigInteger("866534");
		System.out.println("加法操作 = " + bigA.add(bigB));
		System.out.println("减法操作 = " + bigA.subtract(bigB));
		System.out.println("乘法操作 = " + bigA.multiply(bigB));
		System.out.println("除法操作 = " + bigA.divide(bigB));
		//对两个数进行除法操作，并同时保存商和余数
		BigInteger result[]=bigA.divideAndRemainder(bigB);
		System.out.println("商 " + result[0] + " ,余数 " + result[1]);
		
		System.out.println(bigA.pow(2));//A的2次方，相当于下面的A*C
		System.out.println(bigA.multiply(bigC));
	}
}
