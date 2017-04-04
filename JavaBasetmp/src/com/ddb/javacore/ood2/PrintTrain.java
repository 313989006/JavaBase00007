package com.ddb.javacore.ood2;

import java.util.Scanner;

public class PrintTrain {
	public static void printStars(Integer lgth,int high) {
		int tmp = high -lgth;
		lgth--;
		if (lgth<0) {
			return;
		}
		int min =high - tmp;
		int max =high + tmp;
		for (int i = 0; i < high*2+1; i++) {
			if (i >=min && i<=max) {
				System.out.println("*");
			} else {
				System.out.println("");
			}
		}
		System.out.println("\n");
		printStars(lgth,high);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入三角形的高");
		Scanner input = new Scanner(System.in);
		int high = input.nextInt();
		int lengh = high*2 + 1 ;
		System.out.println("三角形的底边长是 : " + lengh);
		Integer lgth = high;
		printStars(lgth,high);
	}
}
