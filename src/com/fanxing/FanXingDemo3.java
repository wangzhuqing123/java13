package com.fanxing;

public class FanXingDemo3 {//外部类
	public<T,S extends T> T testDemo(T t,S s) {//方法
		System.out.println("我是T类型，我的类型是："+t.getClass().getName());
		System.out.println("我是S类型，我的类型是："+s.getClass().getName());
		return t;
	}
	public static void main(String[] args) {
		FanXingDemo3 test=new FanXingDemo3();
		Dog d=new Dog();//构造函数里有输出语句
		Animal a1=new Animal();//构造函数里有输出语句
		Animal a2=test.testDemo(a1,d);//a1是动物，d是小狗
		System.out.println("我是整数，我的类型是："+a2.getClass().getName());
	}
}
//定义一个动物类
class Animal{
	public Animal() {//构造函数
		System.out.println("我是动物");
	}
}
//定义一个小狗类
class Dog extends Animal{
	public Dog() {//构造函数
		System.out.println("我是小狗");
	}
}