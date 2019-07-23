package com.homework;
import java.util.Scanner;
/**
 * @author Administrator
 * 对输入的年、月、日，给出该天是该年的第多少天？
 */
public class HomeWork05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年份：");
		int year=sc.nextInt();
		System.out.println("请输入月份：");
		int month=sc.nextInt();
		System.out.println("请输入日期：");
		int day=sc.nextInt();
		sc.close();
		int days=0;
	switch(month){
		case 12:days+=30;
		case 11:days+=31;
		case 10:days+=30;
		case 9:days+=31;
		case 8:days+=31;
		case 7:days+=31;
		case 6:days+=31;
		case 5:days+=30;
		case 4:days+=31;		
		case 3:
			if ((year%400==0)||(year%4==0&&year%4!=0)) {
				days+=29;
			}else {
				days+=28;
			}
		case 2:days+=31;
		case 1:days+=day;
	}
	System.out.printf("%d年%d月%d日是今年的第%d天",year,month,day,days);
}
}