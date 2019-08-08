package com.exception;

public class ExceptionTest3 {
	public static void main(String[] args ) {
		int[] arr11= null;
		try {
			int res=getArray(arr11);
			System.out.println(res);
		}catch(ArrayIndexOutOfBoundsException ex1) {
			System.out.println(ex1);
			System.out.println("----------------------");
			System.out.println(ex1.getMessage());
			System.out.println("----------------------");
			System.out.println(ex1.toString());
		}
		catch(NullPointerException ex2) {
			System.out.println(ex2);
			System.out.println("----------------------");
			System.out.println(ex2.getMessage());
			System.out.println("----------------------");
			System.out.println(ex2.toString());
		}
	}
	public static int getArray(int[] arr) throws 
	ArrayIndexOutOfBoundsException,NullPointerException{
		if(arr==null) {
			throw new NullPointerException("数组为空！");
		}
		if(arr.length<4) {
			throw new ArrayIndexOutOfBoundsException("数组长度不够");
		}
		int i=arr[3]*3;
		System.out.println("aaa");
		return i;
	}

}
