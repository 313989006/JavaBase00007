package BookTestDemo;

public class CeShi1 {

	public static void main(String[] args) {
		String str1 = " ";
		for (int i = 0; i < 1; i++) {
			str1 = str1 + (char)(Math.random()*26 + 'A');
			System.out.println("输出随机生成的字母 :" + str1);
			
			//随机生成数字
			/*int str=0;
			for (int j = 0; j < 25; i++) {
				str = (char)(Math.random()*1);
				System.out.println("随机生成字母" + str);
			}*/
		}
	}
}
