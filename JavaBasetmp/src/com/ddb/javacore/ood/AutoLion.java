package com.ddb.javacore.ood;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class AutoLion {
	String color = "黄色";
	public void run(){
		System.out.println("正在以10米每秒的速度向前跑");
	}
	public String bark(){
		String sound = "大声吼叫";
		return sound;
	}
	public String getColor(){
		return color;
	}
	public String showLion(){
		return "这是一个" + getColor() + "的玩具狮子";
	}
}
