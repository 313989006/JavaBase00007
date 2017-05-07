package RegExpDemo;
		//利用正常代码方法判断字符串是否由数字组成
public class JudgeString {
	public static boolean isNumber( String str) {
		char data[] =str.toCharArray();
		for (int i = 0; i < data.length; i++) {
			if (data[i] < '0' || data[i] > '9') {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		if (isNumber("345")) {
			System.out.println("由数字组成");
		} else {
			System.out.println("不是由数组组成");
		}
	}
}
