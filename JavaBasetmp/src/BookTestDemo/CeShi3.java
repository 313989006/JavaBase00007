package BookTestDemo;

public class CeShi3 {

	public static void main(String[] args) {
		//使用while循环计算出1到10的和
		/*int i = 1;
		int sum = 0;
		while (i < 11) {
			sum +=i;
			i++;
		}
		System.out.println("1 + 2 + ... + 10 = " + sum );*/
		
		//使用do-while循环计算1到10的和
		/*int i = 1;
		int sum = 0;
		do {
			sum +=i;
			i++;
		} while (i<11);
		System.out.println("1 + 2 + ... + 10 = " + sum );*/
		
		//使用for循环计算1到10的和
		/*int i = 0;
		int sum = 0;
		for (i = 0;i<11; i++) {
			sum +=i;
		}
		System.out.println("1 + 2 + ... + 10 = " + sum );*/
		
		//for循环嵌套的使用:1到9的乘积指标
		for (int i = 1; i < 10; ++i) {
			for (int j = 1; j <=i; ++j) {
				System.out.print(i + " * " + j + " = " + (i*j) +"\t");
			}
			System.out.println();
		}
	}
}
