package com.fanxing;
/**
 * @author Administrator
 *   当不使用泛型时
 */
public class NoFanXingDemo {
	public static void main(String[] args) {
		System.out.println("此例子在说明，当不使用泛型时，我们的程序设计如下：");
		//定义类Fan的一个Integer版本
		Fan intOb=new Fan(88);
		intOb.showType();
		int i = (Integer) intOb.getOb();//类型的强制转换，将Object类型转换为Int类型
		System.out.println("value="+i);
		System.out.println("----------------------------");
	//定义Fan的一个String版本
		Fan stringOb=new Fan("Hello java!"); 
		stringOb.showType();
		String s=(String)stringOb.getOb();//类型的强制转换，将Object类型转换成String类型
		System.out.println("value="+s);
	}
}
class Fan{//Fan类
	private Object ob;//定义一个通用类型成员；
	//重写构造函数
	public Fan(Object ob) {
		this.ob=ob;
	}
	//getOb方法的定义
	public Object getOb() {
		return ob;
	}
	//setOb方法的定义
	public void setOb(Object ob) {
		this.ob=ob;
	}
	public void showType() {
		System.out.println("VALUE的实际类型："+ob.getClass().getName());
	}
}