package com.shiyanlou.objectorient;
/**
 * @author Administrator
 *  封装，即隐藏对象的“属性”和实现细节，仅对外公开接口，控制在程序中属性的读和修改的访问级别
 *  只能通过规定的方法访问数据 
 *  隐藏类的实例细节，方便修改和实现。
 */
public class FengZhuang {//封装作用对象：类的属性
	public static void main(String [] args) {
		People1 LiLei = new People1();
		LiLei.setAge(18);
	System.out.println("李雷的身高是："+LiLei.getAge());	
	}
}
class People1{//放在Fengzhuang这个类下，就是内部类了。
	private int age;
	public int getAge(){
		return age;
	}
	public void setAge(int a) {
		age=a;
	}	
}