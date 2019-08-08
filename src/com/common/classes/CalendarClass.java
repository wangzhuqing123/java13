package com.common.classes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Administrator
 * 但是 Calendar 类是一个抽象类，它完成 Date 类与普通日期表示法之间的转换，而我们更多的是使用 Calendar 类的子类 GregorianCalendar 类。它实现了世界上普遍使用的公历系统。当然我们也可以继承 Calendar 类，然后自己定义实现日历方法。
 Calendar：允许用年、月、日、时、分、秒来解释日期
  DateFormat:允许对表示日期的字符串进行格式化和句法分析
 */
public class CalendarClass {
	public static void main(String[] args) {
		System.out.println("完整显示日期时间：");
		//字符串转换成日期格式,SimpleDateFormat是DateFormat的子类，向上引用。
		DateFormat fdate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=fdate.format(new Date());
		System.out.println(str);
		
		//创建calendar对象
		Calendar calendar=Calendar.getInstance();
		//初始化Calendar对象，但并不重要，除非需要重置时间
		calendar.setTime(new Date());
		//显示年份
		 System.out.println("年： " + calendar.get(Calendar.YEAR));//YEAR是静态变量，直接用类来引用
		//显示月份（从0开始，实际显示加1）
		System.out.println("月： "+calendar.get(Calendar.MONTH));
		//当前分钟
		System.out.println("分钟： "+calendar.get(Calendar.MINUTE));
		//今年的第N天
		System.out.println("今年第： "+calendar.get(Calendar.DAY_OF_YEAR)+"天");
		//本月的第N天
		System.out.println("本月第： "+calendar.get(Calendar.DAY_OF_MONTH)+"天");
		//3小时以后
		calendar.add(Calendar.HOUR_OF_DAY,3);
		System.out.println("3小时以后的时间为："+calendar.getTime());
		//重置calender显示当前时间
		calendar.setTime(new Date());
		str=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(calendar.getTime());
		System.out.println("重置后，显示的当前时间为："+str);
	}
}
