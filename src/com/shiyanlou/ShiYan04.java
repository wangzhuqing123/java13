package com.shiyanlou;
import java.util.Scanner;
/**
 * @author Administrator
 * 获取用户的输入信息（字符串）
   当用户输入 end 时，结束输入并打印用户之前输入的所有信息
 （输入的信息数量不超过 100 个）
 */
public class ShiYan04 {
	public static void main(String [] args) {
		String [] arr=new String[100];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<100;i++) {
			System.out.println("请输入字符串元素：");
			arr[i] = sc.nextLine();
		if (arr[i].equals("end")) {			
			break;
			}
		}
		sc.close();
		System.out.println("输入的数组为:");
		for (String a:arr) {
			if (a.equals("end")) {
            break;
        }
			System.out.print(a+',');
	}	
	}
}
