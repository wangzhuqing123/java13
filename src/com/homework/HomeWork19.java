package com.homework;
import java.util.Scanner;
/**
 * @author Administrator
 * 将一个正整数分解质因数。例如：输入 90，打印出 90=2*3*3*5。
 */
public class HomeWork19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num=sc.nextInt();
		sc.close();
		System.out.printf("%d=",num);
//判断是否可以分解因子	
		for (int i=2;i<num;i++) {
			while(num%i==0) {//每次i都从2开始
				num/=i;//最后的num，肯定是一个不能再分解的数。
				System.out.printf("%d*",i);
			}
	}
			System.out.print(""+num);//最后的 num' num=i*i*num'
}
}