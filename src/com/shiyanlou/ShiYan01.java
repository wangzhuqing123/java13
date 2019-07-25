package com.shiyanlou;
import java.util.Scanner;
/**
 * @author Administrator
   *   ----字符串处理------
*   1.从控制台输入一行字符串
    2.去除字符串中的所有空格
    3.打印去除空格后的字符串
 */
public class ShiYan01 {
	public static void main(String[] args) {
		//从控制台录入字符串
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入需要处理的字符串：");
		String a=sc.nextLine();
		sc.close();
		//StringBulider类的使用
		StringBuilder str = new StringBuilder(a);
		//循环从str中取出每一个字符，判断是否是空格
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {//字符用单引号括起来
				//System.out.printf("输出位置%d处的空格\n",i);
				str.deleteCharAt(i);
				i--;//遇到空格删除后，后面的坐标变成当前坐标，防止两个空格在一起，漏删除；
			}
		}
		 System.out.printf("整理后的字符串如下：\n%s",str.toString());
	}
}