package com.shiyanlou.objectorient;
/**
 * @author Administrator
 * 子类可以继承父类的方法，但如果子类对父类的方法不满意，
 * 想在里面加入适合自己的一些操作时，就需要将方法进行重写。
 * 并且子类在调用方法中，优先调用子类的方法
 */
public class FangFaChongXie {
	public static void main(String[] args) {
		Fu A=new Fu();
		A.bark();
		ZiLei a=new ZiLei();
		a.bark();
		Fu aa=new ZiLei();
		aa.bark();
	}
}
class Fu {
	int legnum;
	void bark() {
		System.out.println("我是父类的方法bark。");
	}
}
class ZiLei extends Fu{
	void bark() {
		System.out.println("我是子类，重写了父类的方法bark。");
	}

}