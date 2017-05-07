package SystemElementDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFomatDemo {
	public static void main(String[] args) {
		//获取当前时间
		LocalDate localDate=LocalDate.now();
		int s = localDate.getMonthValue();
		System.out.println(s);
		//指定格式化规则
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");   //时间格式月份字母为大写
		//将当前时间按照f的格式进行格式化
		String st = localDate.format(f);
		//String str = localDate.format(f);
		System.out.println("时间为 : " + st);
	}
}
