package com.shiyanlou.objectorient;
/**
 * @author ----成员内部类-----
 * 将一个类的定义放在另一个类的定义内部，这就是内部类。而包含内部类的类被称为外部类。
 * 定义成员内部类后，必须使用外部类对象来创建内部类对象，
 * 即 内部类 对象名 = 外部类对象.new 内部类();
 * 成员内部类不能含有 static 的变量和方法，因为成员内部类需要先创建了外部类，才能创建它自己的。
 */
public class NeiBuLei {//外部类
	String name="LiLei";
	public static void main(String[] args){//main方法
		NeiBuLei n=new NeiBuLei();
		NeiBuLei12 n12=n.new NeiBuLei12();//内部类的对象需有外部对象来创建。如果内部类是静态类，则可以。
		n12.stuInfo();
	}
	public class NeiBuLei12{//非静态的内部类
		int age=18;
		void stuInfo() {
			System.out.println("访问内部类中的age属性：我今年"+age);
			System.out.println("访问外部类中的name属性：我的名字叫："+name);
		}
	}
}
