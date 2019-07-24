package com.homework;

/**
 * @author Administrator
 * 解决“百钱买百鸡”问题。公鸡五钱一只，母鸡三钱一只，小鸡
 * 一钱三只，现有百钱欲买百鸡，共有多少种买法？
 */
public class HomeWork10 {
	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			for(int j=1;j<=33;j++) {
				for(int k=1;k<=100-j-i;k++) {
					if((k%3==0)&&(i+k+j==100)&&(5*i+3*j+k/3==100)) {
						System.out.printf("公鸡%d只，母鸡%d只，小鸡%d只",i,j,k);
						System.out.println();
					}
				}
				
			}
		}
	}

}
