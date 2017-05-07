package StringDemo;

import java.lang.reflect.Array;

public class StringTest {

	public static void main(String[] args) {
		String str ="abcd";
		char data[] = {'a','b','c'};
		char dat[] = {'e','f','g'};
		String str1 =new String(data);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str1.charAt(1));
		System.out.println(str1.codePointAt(2));
		System.out.println(str1.codePointBefore(2));
		System.out.println(str1.codePointCount(0, 2));
		System.out.println(str1.contains(str));
		System.out.println(str1.concat(str));
		System.out.println(str1);
		System.out.println(str1.contentEquals(str));
		System.out.println(String.copyValueOf(dat));
		System.out.println(str1.endsWith("s"));//判断字符串是否以s结尾
		System.out.println(str1.format(str, str1));
		System.out.println("a".hashCode());//返回字符a的ASCII值
		System.out.println("a".indexOf(str1));
		System.out.println(str1.isEmpty());
		System.out.println(str.subSequence(0,2));
		System.out.println(str.toCharArray());
		System.out.println(str.toUpperCase());
		System.out.println(str1.valueOf(true));
		System.out.println(str1.offsetByCodePoints(0, 2));
		System.out.println(str1.trim());
		System.out.println(str1.intern());   //返回字符串对象的规范化表示形式。 
		
	}
}

