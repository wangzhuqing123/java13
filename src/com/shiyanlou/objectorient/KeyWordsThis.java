package com.shiyanlou.objectorient;

/**
 * @author Administrator
 * this关键字代表当前对象。使用this.属性操作当前对象的属性，this.方法调用当前对象的方法.
 * 当成员变量和局部变量之间发生冲突时，在属性名前面添加了this关键字。
 *  此时就代表将一个参数的值赋给当前对象的属性。
 */
public class KeyWordsThis {
	public static void main(String [] args) {
		People2 LiLei = new People2();
		LiLei.setAge(18);
	System.out.println("李雷的身高是："+LiLei.getAge());	
	}
}
class People2{//放在Fengzhuang这个类下，就是内部类了。
	private int age;
	public int getAge(){
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}	
}
