package com.shiyanlou.objectorient;

/**
* @author wangxiaogua
 *  类和对象
 * 定义人类：1. 他有属性姓名、身高、年龄   2.行为有吃、笑、秀
 */
public class ClassAndOrient {
	public static void main(String[] args) {
		People Lilei = new People();
		Lilei.name="Lilei";
		Lilei.hight=173.5f;
		Lilei.age=20;
		Lilei.sex='男';
		Lilei.eat();
		Lilei.laugh();
		Lilei.show();
	}
	
}
class People {//同一个文件中，只有一个public类，类之间是并列
	String name;
	float hight;
	int age;
	char sex;
	void eat() {
		System.out.println("我在哭！");
	}
	void laugh() {
		System.out.println("我在笑笑笑！");
	}
	void show() {
		System.out.printf("我的名字叫%s\n",name);
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

