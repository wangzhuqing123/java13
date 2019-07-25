package com.shiyanlou;
/**
 * @author Administrator
 * 数据的应用
 * 有一份成绩单，上面有 10 位学生的成绩
 * （61，57，95，85，75，65，44，66，90，32），
 * 请求出平均成绩并输出
 */
public class ShiYan03 {
	public static void main(String[] args) {
		System.out.println("方法一：");
		int [] score={61,57,95,85,75,65,44,66,90,32};
		int i=1;
		int sum=0;
		int ave=0;
		for(int sc:score) {
			sum+=sc;
			ave=sum/i;
			i++;
		}
		System.out.printf("所有学生的平均成绩为：%d\n", ave);
		System.out.println("方法二：");
		int[] data = {61, 57, 95, 85, 75, 65, 44, 66, 90, 32};
        int sum2 = 0;
        for (int  j= 0; j< data.length; j++) {
            sum2 += data[j];
        }
        System.out.println("平均成绩：" + sum2 / data.length);
    }
	}

