package com.shiyanlou.objectorient;

/**
 * @author Administrator
 *  被 static 修饰的方法是静态方法，静态方法不依赖于对象，
 *  不需要将类实例化便可以调用，由于不实例化也可以调用，
 *  所以不能有 this，也不能访问非静态成员变量和非静态方法。
 *  但是非静态成员变量和非静态方法可以访问静态方法。
 */
public class KeyWordsStatic {
	static String string="HelloWord!";
	public static void main(String[] args) {
		// 当string是Static变量时，以下正确；
		System.out.println("Static时类直接调用："+KeyWordsStatic.string);
		//当string不是一个Static变量时，如下调用；
		System.out.println("非static时，创建实例对象调用："+string);
		//KeyWordsStatic keyWordsStatic= new KeyWordsStatic();
		//System.out.println("非static时，创建实例对象调用："+keyWordsStatic.string);
	}
}
/// 当string是Static变量时，以上两种都可以；