package com.shiyanlou;

/**
 * @author Administrator
 * 最大最小值
 * 现给出一串数据（313, 89, 123, 323, 313, 15, 90, 56, 39）
 * 求出最大值和最小值并输出。
 */
public class ShiYan06 {
	public static void main(String [] args) {
		int [] arr= {313, 89, 123, 323, 313, 15, 90, 56, 39};
		int max=arr[0];
		int min=arr[0];
		for (int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.printf("数组中最大的值为：%d\n",max);
		System.out.printf("数组中最小的值为：%d",min);
	}
}
