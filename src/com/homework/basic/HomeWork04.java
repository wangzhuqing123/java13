package com.homework.basic;
import java.util.Scanner;
/**
 * @author Administrator
 * 输入 3 个正数，判断能否构成一个三角形。
 */
public class HomeWork04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入三角形边a的值：");
		int a=sc.nextInt();
		System.out.println("请输入三角形边b的值：");
		int b=sc.nextInt();
		System.out.println("请输入三角形边c的值：");
		int c=sc.nextInt();
		sc.close();
		if (a<0||b<0||c<0) {
			System.out.println("输入的三个数必须都为正整数。");
		}
		else if ((a+b)>c&&(b+c)>a&&(b+c)>a){
			System.out.printf("%d,%d,%d三个数，可以构成三角形。",a,b,c);
		}
		else {
			System.out.println("输入的三个数无法构成三角形。");
		}
	}
}
