package com.shiyanlou;
import java.util.Scanner;
/**
 * @author Administrator
 * ---字符串对比-------
 *1. 从控制台输入字符串 a 和字符串 b
  2.比较字符串 a 和字符 b 是否完全一致，长度，内容等完全一致。
  3. 如果完全一致，输出相同，如果不一致，输出不同。
  4. 禁止使用equals方法
 */
public class ShiYan02 {
	public static void main(String [] args) {
		//从控制台输入字符串a和字符串b
		Scanner sc=new Scanner(System.in);
		System.out .println("请输入字符串a:");
		String a=sc.nextLine();
		System.out .println("请输入字符串b:");
		String b=sc.nextLine();
		sc.close();
		//a,b两个对象调用静态函数compare
		compare(a,b);
	}
	//写一个对比字符串的函数
	static void compare(String a,String b) {
		if(a.length()!=b.length()) {
			System.out.println("两个字符串不同。");
			return;//加了return后，执行满足后，整个返回，后面的代码都不执行了。
		}
		for(int i=0;i<a.length();i++) {
				if(a.charAt(i)!=b.charAt(i)) {
					System.out.println("两个字符串不同。");
					return;//当有一个a.charAt(i)!=b.charAt(i)满足后，后面的代码都不执行了。
				}
			}
		System.out.println("两个字符串相同。");			
	}
}
