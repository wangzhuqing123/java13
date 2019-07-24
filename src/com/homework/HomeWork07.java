package com.homework;
import java.util.Scanner;
/**
 * @author Administrator
 * 对输入的一个整数，按相反顺序输出该数。例如，输入为 3578
 */
public class HomeWork07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你要倒序排列的整数。");
		int num=sc.nextInt();
		sc.close();	
		//方法一：
		StringBuilder sb =new StringBuilder(String.valueOf(num));
		System.out.printf("方法一转化后的字符串为：%s",sb.reverse());
		System.out.println();
		//方法二：
		String str=num+" ";
		char [] arr=str.toCharArray();
		String tempt=" ";
		for (int i=arr.length-1;i>=0;i--) {
			tempt=tempt+arr[i];
		}
		System.out.printf("方法二转化后的字符串为：%s",tempt);
	}
}
