package com.lemon;
import java.util.Arrays;
public class BubbleSortDay2 {
	public static void main(String [] args) {
		int[] arr= {4,2,3,5,7,1,9};
		for (int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print(Arrays.toString(arr));
	}
}
