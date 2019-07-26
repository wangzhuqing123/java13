package com.shiyanlou.objectorient;
/**
 * @author Administrator
 * 接口用于描述类所具有的功能，而不提供功能的实现，
 * 功能的实现需要写在实现接口的类中，并且该类必须实现接口中所有的未实现方法。
 * 修饰符 interface 接口名称 [extends 其他的接口名] {    }
 */
public class JieKou {
	public static void main(String[] args) {
		Animal123 A=new Animal123();
		A.eat();//父类的方法
		Rabit c=new Rabit();
		c.eat();//子类重写的方法
		c.dump();
		c.travel();//继承父类的方法
		Animal123 b=new Animal123();
		b.eat();//子类重写的方法
		b.travel();//继承父类的方法
		//b.dump();//子类的私有方法，不可调用
	}
}
interface Jiekoukou{//接口的定义，然后下面的类实现接口中的方法。
	int legnum=4; //接口中的成员是static final类型
	public void eat();
	public void travel();
}
class Animal123 implements Jiekoukou{//实现接口中的方法；
	public void eat(){
		System.out.println("实现接口整的方法：吃吃吃");	}
	public void travel(){
		System.out.println("实现接口中的方法：旅游旅游旅游");
	}
}
class Rabit extends Animal123{//子类继承父类；
	public void eat() {
		System.out.println("重写父类中的方法：小兔子吃吃吃");
	}
	public void dump() {
		System.out.println("小兔子蹦蹦跳跳。");
	}
}