package com.shiyanlou;
public class StringTest {
	public static void main(String[] args) {
		String s = "To be or not to be";
		String [] arr=s.split(" ");
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<arr.length;i++) {
			StringBuffer sb1=new StringBuffer(arr[i]);
			sb.append(sb1.reverse());
			sb.append(" ");
		}
		System.out.println(sb);
	}

}
