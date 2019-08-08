package com.common.classes;
import java.util.Arrays;
/**
 * @author Administrator
 * Arrays 类包含用于操作数组的各种方法（例如排序和搜索）。
 * 还包含一个静态工厂，允许将数组转为 List。Arrays.toString;
 * 1.使用 Arrays 将数组[6, 17, 92, 32, 58, 22, 84, 66, 36, 33]进行排序
   2. 找出排序后 33 所在的位置
   3. 测试一下如果不排序能否找到值 33？
 */
public class ArraysClass {
	public static void main(String [] args) {
		int [] arr= {6, 17, 92, 32, 58, 22, 84, 66, 36, 33};
		//Arrays.sort(arr);
		//System.out.printf("排序后的数组：%s\n", Arrays.toString(arr));
		int i=Arrays.binarySearch(arr,33);
		//System.out.printf("排序后数组中33的位置为：%d", i);
		System.out.printf("不排序,数组中33的位置为：%d\n", i);
		System.out.println(arr[9]);
	}
}
