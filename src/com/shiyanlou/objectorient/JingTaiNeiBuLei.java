package com.shiyanlou.objectorient;
/**
 * @author ----静态内部类-----
 * 静态内部类通常被称为嵌套类。
 * 静态内部类不能直接访问外部类的非静态成员，但可以通过 new 外部类().成员 的方式访问
 * 如果外部类的静态成员与内部类的成员名称相同，可通过类名.静态成员访问外部类的静态成员；如果外部类的静态成员与内部类的成员名称不相同，则可通过成员名直接调用外部类的静态成员
 * 创建静态内部类的对象时，不需要外部类的对象，可以直接创建 内部类 对象名= new 内部类();
 */
public class JingTaiNeiBuLei {//外部类
	//static String name="LiLei";
	String student="LiLei";
	public static void main(String[] args){//main方法
		//NeiBuLei n=new NeiBuLei();
		NeiBuLei12 n=new NeiBuLei12();//内部类是静态类，直接创建对象。
		n.stuInfo();
	}
	public static class NeiBuLei12{//静态的内部类
		static int student=18;
		void stuInfo() {
			System.out.println("访问内部类中的age属性：我今年"+student);
			//当不是外部类的成员不是静态时，访问方式如下。静态的可直接访问
			//当外部类的静态的成员和内部类一致，访问时，带上类名。
			System.out.println("访问外部类中的name属性：我的名字叫："+new JingTaiNeiBuLei().student);//内部类依赖外部类的产生而产生。
		}
	}
}
