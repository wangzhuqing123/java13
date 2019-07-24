package com.homework.basic;
import java.util.Random;
/**
 * @author Administrator
 * 一个3位数整数的各位数字之和能被 9 整除，则该数也能被 9 整除。编程验证给定的整数能否被 9 整除。
 */
public class HomeWork14 {
	public static void panduan(int num) {
		int a=num/100;
		int b=num/10%10;
		int c=num%10;
		if((a+b+c)%9==0) {
			System.out.printf("%d各位数字之和能被9整除 ,",num);
		}
		else {
			System.out.printf("%d各位数字之和不能被9整除，",num);
		}
		if(num%9==0) {
			System.out.printf("%d也能被9整除。",num);
		}
		else {
			System.out.printf("%d也不能被9整除。",num);
		}
	}
     public static void main(String [] args) {
    	Random rd=new Random();
    	int shu=10+rd.nextInt(90);
    	panduan(shu);
     }  
    }
 
    