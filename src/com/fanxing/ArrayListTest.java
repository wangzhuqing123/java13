package com.fanxing;
import java.util.*;
/**
 * @author Administrator
 * ArrayList　类实现一个可增长的动态数组，位于 java.util.ArrayList<E>。
 * 实现了 List 接口，它可以存储不同类型的对象（包括 null 在内），而数组则只能存放特定数据类型的值。
 */
public class ArrayListTest {
	public static void main(String[] arg) {
		
	}
}
//学生类
class Student{
	public String id;
	public String name;
	//重写构造函数
	public Student(String id ,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student{"+"id="+id+'\''+",name="+name+'\''+'}';
	}
	
}
//存放学生的List
class ListTest{
	public List<Student> students;//定义一个存放学生的List
	public ListTest() {//重写构造函数
		this.students=new ArrayList<Student>();
	}
	//往students列表中添加数据
	void testAdd() {
		// 创建一个学生对象，并通过调用add方法，添加到学生管理List中
		Student st1=new Student("1","张三");
		students.add(st1);
		// 取出 List中的Student对象 索引为0 也就是第一个
		Student temp=students.get(0);
		System.out.println("添加了学生："+temp.id+temp.name);
		Student st2=new Student("2","李四");
		//添加到list中，插入到索引为0的位置，也就是第一个
		students.add(0,st2);
		Student temp2=students.get(0);
		System.out.println("添加了学生："+temp2.id+temp2.name);
		 // 对象数组的形式添加
		Student[] student= {new Student("3","王五"),new Student("4","马六")};
		 // Arrays类包含用来操作数组（比如排序和搜索）的各种方法，asList() 
		//方法用来返回一个受指定数组支持的固定大小的列表
		students.addAll(Arrays.asList(student));
		Student temp3=students.get(2);
		Student temp4=students.get(3);
		System.out.println("添加了学生：" + temp3.id + ":" + temp3.name);
        System.out.println("添加了学生：" + temp4.id + ":" + temp4.name);
	}

}












