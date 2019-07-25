package com.shiyanlou;
import java.util.Scanner;
public class ShiYan05 {
	   public static void main(String[] args) {
	        String[] data = new String[100];
	        Scanner a = new Scanner(System.in);
	        for (int i = 0; i < 100; i++) {
	            if ((data[i] = a.nextLine()).equals("end")) {
	                break;
	            }
	        }
	        a.close();
	        for (String b: data) {
	            if (b.equals("end")) {
	                break;
	            }
	            System.out.println(b);
	        }
	    }
	}

