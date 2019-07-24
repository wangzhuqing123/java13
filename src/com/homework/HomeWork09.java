package com.homework;

/**
 * @author Administrator
 * 输出 200~500 之间的所有素数
 */
public class HomeWork09 {
	public static void main(String[] args) {
		int num=200;
		while (num<=500) {
			boolean flag=true;
			for (int i=2;i<num-1;i++) {
				if(num%i==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println(num);
			}
			num++;
		}
		
	}
}
