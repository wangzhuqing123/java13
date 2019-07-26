package com.shiyanlou.objectorient;
/**
 * @author Administrator
 * 方法重载是指在一个类中定义多个同名的方法，
 * 但要求每个方法具有不同的参数的类型或参数的个数。
 * 方法重载一般用于创建一组任务相似但是参数不同的方法。
 */
public class FangFaChongZai {
	public static void main(String[] args) {
		Test one=new Test();
		one.f(2);
		one.f("abc");
		one.f(2,"eft");
		one.f("abcd","efgt");
	}
}
class Test{
	void f(int t1) {
		System.out.println("t1="+t1);
	}
	void f(String t1) {
		System.out.println("t1="+t1);
	}
	void f(int t1,String t2) {
		System.out.println("t1="+t1+","+"t2="+t2);
	}
	void f(String t1,String t2) {
		System.out.println("t1+t2="+t1+t2);
	}
}