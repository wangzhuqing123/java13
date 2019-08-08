package com.shiyanlou;
/**
 * @author Administrator
 * 前数组："name=zhangsan age=18 classNo=090728"
 * 输出：zhangsan 18 090728
 */
public class StringTest2 {
	public static void main(String[] args) {
		String str = "name=zhangsan age=18 classNo=090728";
		String s1=str.replace("=", " ");//name zhangsan age 18..
		String []arr=s1.split(" ");
		StringBuffer sS=new StringBuffer();
		for(int i=0;i<arr.length/2;i++){
			sS.append(arr[2*i+1]);
			sS.append(" ");
		}
		System.out.println(sS);
	}
}
