package com.homework.basic;
/**
 * @author Administrator
  *  已知 XYZ+YZZ=532，其中，X、Y、Z 为数字，编程求出 X、Y 和 Z 的值。
 */
public class HomeWork17 {
	public static void main(String[] args) {
		for(int x=1;x<10;x++) {
			for(int y=1;y<10;y++) {
				for(int z=1;z<10;z++) {
					if(x*y*z+y*z*z==432) {
						System.out.printf("x=%d y=%d z=%d\n", x,y,z);
					}
				}
			}
		}

	}
	
}
