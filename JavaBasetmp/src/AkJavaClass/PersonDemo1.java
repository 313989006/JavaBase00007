package AkJavaClass;

public class PersonDemo1 {
	/*//用静态方法初始化对象数组
	String name;
	int age;
	public PersonDemo1(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String talk() {
		return "我是 : " + this.name + ",今年 : "+ this.age;
	}
	public static void main(String[] args) {
		PersonDemo1[] p={
				new PersonDemo1("张三",28),
				new PersonDemo1("赵四",50),
				new PersonDemo1("王武",47),
		};
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].talk());
		}
	}*/
	
	/*//实例化Person类对象，并给属性赋值
	String name = "sb杨金星";
	int age = 38;
	String like =" 尿频 ";
	static PersonDemo1 sb =new PersonDemo1();
	public void xian(String name ,int age ,String like) {
		this.name=name;
		this.age=age;
		this.like=like;
	}
	public String er(){
		return "我是 : "+ this.name + ",今年 "+ this.age + "岁 ,"+ " ,非常喜欢 "+ this.like;
	}
	public static void main(String[] args) {
		System.out.println(sb.er());
	}*/
	
	//构造方法的重载
	private String name;
	private int age;
	public PersonDemo1(int age) {
		name ="金星";
		this.age=age;
	}
	public PersonDemo1(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void say() {
		System.out.println("你叫 : " + this.name + "  我今年 : " + this.age + "岁");
	}
	public static void main(String[] args) {
		PersonDemo1 p1=new PersonDemo1(30);
		PersonDemo1 p2=new PersonDemo1("狗屎",40);
		p1.say();
		p2.say();
	}
}
