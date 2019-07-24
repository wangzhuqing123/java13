package com.homework.basic;
/**
 * @author Administrator
 *求一个一元二次方程的平方根。
 *△=b^2-4ac的值,若△小于0,一元二次方程无根.若△等于0,
 *一元二次方程有两个相等的根.若△大于0,一元二次方程有两个不相等的实数根
 */
import java.util.Scanner;
public class HomeWork02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入二次方的系数：");
		int a=sc.nextInt();
		System.out.println("请输入一次方的系数：");
		int b=sc.nextInt();
		System.out.println("请输入0次方的系数：");
		int c= sc.nextInt();
		sc.close();
		if(b*b-4*a*c<0) {
			System.out.println("一元二次方程无根。");
		}
		else if(b*b-4*a*c==0) {
			System.out.println("一元二次方程有两个相等的根。");
			double x=(-b+Math.sqrt(b*b-4*a*c))/2*a;
			System.out.printf("该方程有两个相等的根：%f",x);
		}
		else {
			double x1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
			double x2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
			System.out.printf("该方程有两个根,分别为：%f，%f",x1,x2);
		}
		
	}
}
