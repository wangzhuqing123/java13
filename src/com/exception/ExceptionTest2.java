package com.exception;
import java.util.regex.Pattern;
import java.util.Scanner;
public class ExceptionTest2 {
	public static void main(String[] args ) {
		Scanner sc=new Scanner(System.in);
		String phone=sc.nextLine();
		sc.close();
		Pattern pattern=Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
		boolean matcher=pattern.matcher(phone).matches();
		System.out.println(phone+ "匹配结果：" +matcher );
	}

}
