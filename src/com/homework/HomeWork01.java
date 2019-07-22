package com.homework;
import java.util.Scanner;
/**
 * @author Administrator
 *实现对给定的 4 个整数从大到小的顺序排列。
 *函数的使用
 */
public class HomeWork01 {
	int number=6;
	int [] t1=new int[number];
	public static void main(String[] args) {//函数入口	
		HomeWork01 arry=new HomeWork01();
		arry.arrsort();
	}
void arrsort() {
//第一步：控制台中随机取出四个数,创建数组t1。
	System.out.printf("请输入 需要排序的 %d个数：",number);
	Scanner in_t1=new Scanner(System.in);
	for (int i=0;i<number;i++) {
		t1[i]=in_t1.nextInt();
	}
	in_t1.close();
//第二步: 将t1数组中的数排序,冒泡排序。
	for (int i=0;i<t1.length;i++) {
		for(int j=i+1;j<t1.length;j++) {
			if (t1[i]>t1[j]) {
				int a=t1[i];
				t1[i]=t1[j];
				t1[j]=a;
			}
	}
		}
//第三步：输出排序后的数组
	System.out.println("排序后的数组如下：");
	for(int i=t1.length-1;i>=0;i--) {
			System.out.println(t1[i]+"\t");
	}
}
}
