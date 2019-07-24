package com.homework.basic;

/**
 * @author Administrator
 * 用 while 循环，计算 1~200 之间所有 3 的倍数之和。
 */
public class HomeWork08 {
	public static void main(String[] args) {
		int sum=0;
		int i=1;
		while(i<=200) {
			if(i%3==0){
				sum=sum+i;
			}
			i++;
		}
		System.out.printf("-------------------------\n1~200 之间所有 3 的倍数之和为：%d\n-------------------------",sum);
	}
 }
