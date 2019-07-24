package com.homework;

/**
 * @author Administrator
 * 古典问题：有一对兔子，从出生后第 3 个月起每个月都生一对兔子，小兔
   子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
public class HomeWork18 {
	public static void main(String [] args) {
		int m1=1;
		int m2=1;
		int sum=0;
		for(int month=1;month<=12;month++) {
			if (month<3) {
				sum=1;
			}
			else {
				sum=m1+m2;
				m1=m2;
				m2=sum;
			}
			System.out.printf("第%d个月的兔子数量为：%d\n",month,sum*2);
		}
	}
}
