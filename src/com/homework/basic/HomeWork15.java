package com.homework.basic;

/**
 * @author Administrator
 *  猴子吃桃问题。猴子第一天摘下若干个桃子，当时就吃了一半，还不过瘾，
就又吃了一个。第二天又将剩下的桃子吃掉一半，又多吃了一个。以后每天都吃
前一天剩下的一半零一个。到第 10 天在想吃的时候就剩一个桃子了,求第一天共
摘下来多少个桃子？
 */
public class HomeWork15 {
	public static void main(String [] args) {
		int n=1;
		int day=10;
		for(int i=1;i<=10;i++) {
			System.out.printf("第%d天，有%d个桃子\n",day,n);
			n=(n+1)*2;
			day--;
		}
		
	}

}
