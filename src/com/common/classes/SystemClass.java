package com.common.classes;
import java.util.Arrays;
/**
 * @author Administrator
 * 标准输入，标准输出和错误输出流;
访问外部定义的属性和环境变量;
加载文件和库的方法;
以及用于快速复制数组的实用方法。
System 不可以被实例化，只可以使用其静态方法。
 */
public class SystemClass {
	public static void main(String[] args) {
		int [] a= {1,4,6,8,9,0,3};
		int [] b= {13,15,17,12,19,10};
		int [] c= {1,2,2,2,9,0,3};
		System.arraycopy(a, 0, b, 0, 3);//改变目标b数值的字串
		System.arraycopy(a, 0, c, 0, 7);
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(b));//数字以字符串的形式输出
		System.out.println("当前系统时间："+System.currentTimeMillis());
		System.out.println("java版本信息："+System.getProperty("java.version"));
		System.out.println("javahome的路径："+System.getProperty("java.home"));
		//运行垃圾收集器
		System.gc();
		//退出
		System.exit(0);
	}

}
