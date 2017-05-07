package RegExpDemo;
		//使用正则表达式判断字符串是否由数字组成
public class RegExpTest {

	public static void main(String[] args) {
		//if-else条件判断
		if ("123".matches("\\d+")) {
			System.out.println("由数字组成!");
		} else {
			System.out.println("不是由数字组成!");
		}
	}
}
