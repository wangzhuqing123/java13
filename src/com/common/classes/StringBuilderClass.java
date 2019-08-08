package com.common.classes;
/**
 * @author Administrator
 * StringBuilder 类是可变的。它是 String 的对等类；
 * 它是 String 的对等类，它可以增加和编写字符的可变序列，
 * 并且能够将字符插入到字符串中间或附加到字符串末尾（当然是不用创建其他对象的）
 */
public class StringBuilderClass {
	public static void main(String [] args) {
		StringBuilder a=new StringBuilder("I ");//初始化一个“I”的字串
		a.insert(2, "Love ");
		a.append("Java");
		String s=a.toString();//将字串a转化为字符串s
		System.out.println(s);
	}
}
