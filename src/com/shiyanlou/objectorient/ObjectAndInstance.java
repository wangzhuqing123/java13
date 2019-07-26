package com.shiyanlou.objectorient;
/**
* @author Administrator
 *  变量objectAndInstance1 就真的是 ObjectAndInstance对象么，这里其实只是创建了一个ObjectAndInstance对象的引用;
 *  如果改变 objectAndInstance2对象内部的属性，那么t1的属性同样会改变;
*/
public class ObjectAndInstance {
	public static void main(String [] args) {
		//objectAndInstance1是ObjectAndInstance类的一个对象引用，指向一个地址，不分配内存；
		ObjectAndInstance objectAndInstance1=new ObjectAndInstance();
		//将objectAndInstance1地址赋值给objectAndInstance2
		ObjectAndInstance objectAndInstance2=objectAndInstance1;
		//验证1和2指向同一个位置。true
		System.out.println(objectAndInstance1==objectAndInstance2);
	}
}
