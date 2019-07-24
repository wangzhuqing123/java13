package com.homework.basic;
import java.util.Scanner;
/**
 * @author Administrator
 * 输入一个字符，判断它是否为小写字母，如果是，将它转换成大写。
 * 65～90为26个大写英文字母，97～122号为26个小写英文字母。
 */
public class HomeWork03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入字母：");
		char char1=sc.next().charAt(0);
		if(char1>65 && char1<90) {
			System.out.printf("字母%s本身就是大写字母，不需要转化。",char1);
		}
		else if(char1>97 && char1<122) {
			char char2=(char)(char1-32);
			System.out.printf("字母%s转化为大写字母为\n%s",char1,char2);
		}
		else {
			System.out.printf("输入的不是字母，请重新输入。");
		}
		sc.close();
	}
}
