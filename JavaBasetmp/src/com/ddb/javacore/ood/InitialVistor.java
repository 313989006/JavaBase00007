package com.ddb.javacore.ood;

import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;
public class InitialVistor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Vistor v = new Vistor();
		System.out.println("请输入姓名 : ");
		v.name = input.next();
		System.out.println("请输入年龄 : ");
		v.age = input.nextInt();
		v.show();
	}
}
