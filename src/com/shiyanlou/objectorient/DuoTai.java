package com.shiyanlou.objectorient;
/**
 * @author Administrator
 * Java 实现多态有三个必要条件：继承、重写和向上转型（即父类引用指向子类对象）。
 * Java 中多态的实现方式：继承父类进行方法重写，抽象类和抽象方法，接口实现。
 */
public class DuoTai {//本实例演示向上转型的用法
	public static void main(String[] args) {
		Cat cat1=new Cat();
		Animals animal=new Animals();
		Animals cat2=new Cat();//向上转型，cat2拥有子类和父类的属性和方法，但是不能使用子类特有的方法。
		cat1.bark();
		animal.bark();
		cat2.bark();//用的是子类重新后的bark方法
		cat1.eat();
		//animal.eat();//子类公用父类的属性和方法，相反不行。
		//cata2.eat();//向上转型时，不能使用子类特有的方法；
	}
}
class Animals{
	int legs;
	void bark() {
		System.out.println("动物都会叫");
	}
}
class Cat extends Animals{//子类继承父类
	void bark() {//父类方法的重写，重写要保持格式一致，类型和参数个数。
		System.out.print("我是小花猫：");
		System.out.println("喵！喵！喵！");
	}
	void eat() {
		System.out.print("小猫咪爱吃鱼！");
	}
}