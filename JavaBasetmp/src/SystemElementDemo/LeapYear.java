package SystemElementDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

/*public class GetDateTime {

	public static void main(String[] args) {
		//新建一个LocalDateTime对象获取当前时间
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("当前时间是 : " + ldt);
	}
}*/
public class LeapYear{
	public static void main(String[] args) {
		//用指定的年获取一个Year
		Year y = Year.of(2016);
		//从Year中获取YearMonth
		YearMonth ym =y.atMonth(2);
		//YearMonth指定日得到LocalDate
		LocalDate ld=ym.atDay(28);
		System.out.println(ld);
		//判断是否为闰年
		System.out.println("是否为闰年 : " + ld.isLeapYear());
		//自动处理闰年的2月日期
		//创建 一个MonthDay
		MonthDay md =MonthDay.of(2, 28);
		LocalDate ly =md.atYear(2016);
		System.out.println("闰年 : " + ly);
		//同一个MonthDay关联到另一个月份上
		LocalDate nonleapYear =md.atYear(2016);
		System.out.println("非闰年 : " + nonleapYear);
	}
}
