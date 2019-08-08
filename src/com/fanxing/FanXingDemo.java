package com.fanxing;
/**
 * @author Administrator
 *  使用泛型时，程序改装
 *  泛型即参数化类型，也就是说数据类型变成了一个可变的参数
在不使用泛型的情况下，参数的数据类型都是写死了的
使用泛型之后，可以根据程序的需要进行改变。
 */
public class FanXingDemo {
	public static void main(String[] args) {
		System.out.println("此例子在说明，当使用泛型时，在实例中成员变量的类型就不需要强行转换了");
		//定义泛型类Fan的一个Integer版本
		FanX<Integer> intOb=new FanX<Integer>(88);//定义整数intOb=88
		intOb.showType();
		int i=intOb.getOb();//不需要再强制转换类型了
		System.out.println("value="+i);
		System.out.println("----------------------------------");
		//定义泛型类Fan的一个String版本
		FanX<String> str=new FanX<String>("Hello java!!!");
		str.showType();
		String s=str.getOb();
		System.out.println("value="+s);
	}
}
class FanX<T>{
	private T ob;//定义泛型成员变量；
	public FanX(T ob) {
		this.ob=ob;//构造函数重新，所有类型用T表示
	}
	public T getOb() {
		return ob;
	}
	public void setOb(T ob) {
		this.ob=ob;
	}
	public void showType() {
		System.out.println("T的实际类型为："+ob.getClass().getName());
	}
}