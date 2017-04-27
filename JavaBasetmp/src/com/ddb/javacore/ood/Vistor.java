package com.ddb.javacore.ood;

import java.util.Scanner;
public class Vistor {
	String name;
	int age;
	
	//显示信息方法
	public void show(){
		Scanner input =new Scanner(System.in);
		//while(!"n".equals(name)){
			if (age >= 18 && age <=60) { //判断年龄
				System.out.println(name + "年龄为: " + age + ",价格为20元");
			}else{
				System.out.println(name + "年龄为 : " + age + ",免费");
			//}
		}
	}

}
