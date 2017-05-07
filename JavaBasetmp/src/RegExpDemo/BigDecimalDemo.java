package RegExpDemo;

import java.math.BigDecimal;

//大型浮点数操作类BigDecimal,加入了小数的概念
public class BigDecimalDemo {

	public static void main(String[] args) {
		BigDecimal big1=new BigDecimal("7978562739475386.2");
		BigDecimal big2 = new BigDecimal("866534.2");
		System.out.println("加法操作 = " + big1.add(big2));
		System.out.println("减法操作 = " + big1.subtract(big2));
		System.out.println("乘法操作 = " + big1.multiply(big2));
		//指定商保留一位小数
		System.out.println("除法操作 = " + big1.divide(big2,BigDecimal.ROUND_DOWN));
		//进一法保留一位小数
		System.out.println("进一法保留一位小数 = " + big1.multiply(big2).setScale(1, BigDecimal.ROUND_UP));
	}

}
