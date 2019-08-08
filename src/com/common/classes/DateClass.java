package com.common.classes;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author Administrator
 * Date 类表示日期和时间，里面封装了操作日期和时间的方法。
 * Date 类经常用来获取系统当前时间。
 */
public class DateClass {
	public static void main(String[] args) {
		String strDate;
		Date objDate=new Date();
		System.out.println("今天的日期是："+objDate);
		long time=objDate.getTime();
		System.out.println("自1970年1月1日起以毫秒为单位的时间（GMT）:"+time);
		strDate=objDate.toString();
		System.out.println(strDate);
		SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("带格式的时间："+s.format(objDate));
	}
}
