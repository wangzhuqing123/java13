package com.shiyanlou.objectorient;

/**
* @author wangxiaogua
 * 构造函数的用法
 * 一个类可以定义多个构造方法。
 * 如果在定义类的时候没有写构造方法，系统会默认生成一个无参构造方法，这个构造方法什么也不会做。
 * 当不定义构造函数时。默认一个无参的构造函数，new + 构造方法可以创建一个新的对象；
 * 当有指定的构造方法时，系统都不会再添加无参构造方法了。
 */
public class GouZaoFangFa {
	public static void main(String[] args) {
		Ren Lilei = new Ren("maomao",173.5f,20,'男');//调用构造函数Ren();
		Lilei.eat();
		Lilei.laugh();
		Lilei.show();
	}
}
class Ren {
	//有参构造函数的定义；
	String name;
	float hight;
	int age;
	char sex;
	Ren(String a,float b,int c,char d){
		name=a;
		hight=b;
		age=c;
		sex=d;
	}
	void eat() {
		System.out.println("我在哭！");
	}
	void laugh() {
		System.out.println("我在笑笑笑！");
	}
	void show() {
		System.out.printf("我的名字叫%s\n",this.name);
		System.out.printf("我的身高是%2f cm！\n",hight);
		System.out.printf("我的年龄是%d 岁！\n",age);
		if(this.sex=='男') {
			System.out.println("我是男性！");
		}
		else {//当sex的属性没给值，为null时，这个条件也成立；
			System.out.println("我是女性哦哦哦！");
		}
	}
}

