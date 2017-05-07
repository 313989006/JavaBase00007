package RegExpDemo;
public class SubString {

	public static void main(String[] args) {
		/*//使用String进行正则操作
		String str ="a1b22c333d4444e55555f666666g";
		//[0-9]和+中间无空格
		//String regex = "[0-9]+";   //数字出现1次或多次，除去所有的数字，只剩下字母
		String regex = "\\d+";   //数字出现1次或多次
		System.out.println(str.replaceAll(regex,""));*/
		
		//验证邮箱格式,返回值为true或者false
		//声明一个变量并赋值(字符串类寻根)
		String str2 = "mldnqa@163.com";
		//利用正则表达式，声明一个变量
		String regex = "\\w+@\\w+\\.\\w+";
		System.out.println(str2.matches(regex));
		
		String str3 = "mldnqa@163.com";
		//利用正则表达式，声明一个变量
		String regex3 = "\\w+@\\w+\\.\\w+";
		System.out.println(str3.matches(regex3));
		
	}
}
