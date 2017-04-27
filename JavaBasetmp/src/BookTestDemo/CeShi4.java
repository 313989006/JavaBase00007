package BookTestDemo;

public class CeShi4 {

	public static void main(String[] args) {
		//break语句的使用
		/*int i = 0;
		for ( i = 1; i < 10; i++) {
			if (i%3 == 0) 
				break;
			System.out.println(" i = " + i);
		}
		System.out.println("循环中断 : i = "+ i);*/
		for (int i = 0; i <= 2; i++) {
			System.out.println("最外层循环 " + i);
			loop:  //中间层for循环标签
			for (int j = 0; j <= 2; j++) {
				System.out.println("中间层循环 " + j);
				for (int k = 0; k < 2; k++) {
					System.out.println("最内层循环  " + k);
					break loop;
				}
			}
		}
	}
}
