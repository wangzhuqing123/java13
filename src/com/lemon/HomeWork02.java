package com.lemon;
import java.util.Scanner;
/**
 * @author Administrator
 * 为小明定制学习计划，星期一、星期三、星期五学习编程，星期二、星期四、星期六学习英语，星期日休息
 */
public class HomeWork02 {
	public static void main(String [] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入今天是星期几：一、二、三、四、五、六、日？");
		String day=scanner.nextLine();
		scanner.close();
		switch(day) {
			case("一"):
			case("三"):
			case("五"):System.out.println("今天学习编程");
			break;
			case("二"):
			case("四"):
			case("六"):System.out.println("今天学习英语");
			break;
			default:System.out.println("今天休息哦");
		}

	}
}
