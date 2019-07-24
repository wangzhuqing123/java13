package com.homework.basic;
import java.util.Scanner;
/**
 * @author Administrator
 * 从键盘输入一个 0~99999 之间的任意数，判断输入的数是几位数？
 */
public class HomeWork06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个五位数以内的正整数");
		int num=sc.nextInt();//假如用户输入了小数，还不会使用异常。
		if (num/10000>=1) {
			System.out.printf("%d是一个五位数",num);
		}
		else if (num/1000>=1) {
			System.out.printf("%d是一个四位数",num);
		}
		else if (num/100>=1) {
			System.out.printf("%d是一个三位数",num);
		}
		else if (num/10>=1) {
			System.out.printf("%d是一个两位数",num);
		}
		else if (num/1>=1||num==0) {
			System.out.printf("%d是一个一位数",num);
		}
		else {
			System.out.printf("请输入正整数。");
		}
		sc.close();
	}
}
