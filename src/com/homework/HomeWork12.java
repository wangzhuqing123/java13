package com.homework;
import java.util.Scanner;
/**
 * @author Administrator
 * 验证“鬼谷猜想”：对任意自然数，若是奇数，就对它乘以 3 再加 1；若是偶数，就对它除以 2，
 * 这样得到一个新数，再按上述计算规则进行计算，一直进行下去，最终必然得到 1。
 */
public class HomeWork12 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入：");
		int num=sc.nextInt();
		sc.close();
		while(num>1) {
			if(num%2!=0) {
				num=num*3+1;
			}else {
				num/=2;
			}
		}
		System.out.println(num);
	}

}
