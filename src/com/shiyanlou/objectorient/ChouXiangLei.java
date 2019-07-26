package com.shiyanlou.objectorient;
/**
 * @author 抽象类的使用
 * 抽象类是限制规定子类必须实现某些方法，但不关注实现细节。
 * 1.用 abstract 修饰符定义抽象类
   2.用 abstract 修饰符定义抽象方法，只用声明，不需要实现
   3.包含抽象方法的类就是抽象类
   4.抽象类中可以包含普通的方法，也可以没有抽象方法
   5.抽象类的对象不能直接创建，通常是定义引用变量指向子类对象。
 */
public class ChouXiangLei{
	public static void main(String[] args) {
		//Phone phone=new Phone();//抽象类的对象不能直接创建，通常是定义引用变量指向子类对象
		Phone phone1=new TellPhone();//这样向上转型是可以的
		phone1.call();
		phone1.home();//子类重写后的方法
		TellPhone tellphone=new TellPhone();
		tellphone.call();
		tellphone.sentmessage();
		tellphone.home();//调用子类重写后的方法
	}
}
abstract class Phone{
	abstract void call();
	abstract void sentmessage();
	void home(){
		System.out.println("抽象类中也可以有普通的方法");
	}
}
class TellPhone extends Phone{
	void call() {
		System.out.println("我可以打电话");//必须实现继承的抽象类中的抽象方法
	}
	void sentmessage() {
		System.out.println("我可以发短信");//必须实现继承的抽象类中的抽象方法
	}
	void home() {
		System.out.println("抽象类中的普通方法，子类照样可以重写");
	}
}