package EqualsDemo;

public class Person1 {
	String name;
	int age;
	String like;
	
	public Person1(String name,int age,String like) {
		this.name=name;
		this.age=age;
		this.like=like;
		
		}
	public String talk(){
		return "你是 : " + this.name + "   年龄 : "+ this.age + "  喜欢"+ this.like;
	}
	public static void main (String[] args){
		Person1[] p={
		new Person1("和宇梅", 21, "小狗"),
		new Person1("小马哥", 25, "小猫"),
		};
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].talk());
		}
}
	
}