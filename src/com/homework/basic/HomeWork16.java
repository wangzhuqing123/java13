package com.homework.basic;

/**
 * @author Administrator
 * 水仙花数是指一个 n 位数 ( n≥3 )，它的每个位上的数字的 n 次幂之和等
    于它本身。（例如：1^3 + 5^3 + 3^3 = 153）。编程求出所有三位的水仙花数。
 */
public class HomeWork16 {
	public static void main(String[] args) {
		for (int i=100;i<1000;i++) {
			if(shuixian(i)) {
				System.out.printf("%d是一个水仙数。\n", i);
			}
		}
    }
	public static boolean shuixian(int num) {
		int a=num/100;
		int b=num/10%10;
		int c=num%10;
		return Math.pow(a,3)+Math.pow(b, 3)+Math.pow(c,3)==num?true:false;
	}

}
