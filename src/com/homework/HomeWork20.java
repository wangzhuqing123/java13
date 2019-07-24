package com.homework;
import java.util.Scanner;
/**
 * @author Administrator
 *  用递归的方法完成作业18，小兔子繁衍的问题。
 *  其实从第三个月开始，兔子的对数，都是前两个月之和。
 */
public class HomeWork20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入月份：");
		int month =sc.nextInt();
		sc.close();
		//HomeWork20 rabit=new HomeWork20();因为digui()方法是静态的，所以可以不new实例。如果去掉static,则此处不能省略。
		System.out.printf("%d月，兔子的总数为： %d",month,(digui(month))*2);
	}
	
	public static int digui(int month) {//此处有没有satatic,关系到调用该方法时，是否需要新建实例。
		if(month<3) {
			return(1);
		}
		else {//第三个月开始，每个月都是钱另个月的和。
			return(digui(month-1)+digui(month-2));
		}
	}
}
