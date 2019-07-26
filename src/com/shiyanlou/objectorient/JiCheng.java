package com.shiyanlou.objectorient;
/** 
 * class Dog extends Animal
 * @author Administrator
 * 子类拥有父类除 private 以外的所有属性和方法
   子类可以拥有自己的属性和方法
   子类可以重写实现父类的方法
 Java 中的继承是单继承，一个类只有一个父类
 */
public class JiCheng {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.legnum=4;
		dog.speak();
		dog.dog();
	}
	
}
class Animal{
	int legnum;
	void speak() {
		System.out.println("动物会叫");
	}
}
class Dog extends Animal{
	void dog() {
		System.out.println("小狗狗会叫");	
	}
}