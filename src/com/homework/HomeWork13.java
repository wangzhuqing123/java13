package com.homework;

/**
 * @author Administrator
 * 编程求 1~10000 之间的所有“完全数”，完全数是该数的所有因子之和等于该数的数。例如，6 的因子有 1、2、3，且 6=1+2+3，所以 6 是完全数。
 */
public class HomeWork13 {
	public static void main(String [] args) {
		int num=1;
		while(num<=10000) {
			int sum=0;
			for(int i=1;i<num;i++) {
				if(num%i==0) {
					sum=sum+i;
				}
			}
			if (sum==num) {
				System.out.println(num);
			}
			num++;
		}
	}
}
