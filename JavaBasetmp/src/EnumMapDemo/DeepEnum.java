package EnumMapDemo;
	enum NewFruit{
		//定义NewFruit的单个对象
		APPLE("苹果",22),
		ORANGE("橘子",44),
		BANANA("香蕉",66);
	String name;
	int index;
	private NewFruit(String name,int index) {
	this.name = name;
	this.index = index;
	}
	//普通方法：有参构造方法，两个参数
	public static  String getName(int index) {
		for (NewFruit f : NewFruit.values()) {
			if (f.getIndex() == index) {
				return f.name;
			}
		}
		return null;
	}
	//无参构造方法
	public String getName() {
		return name;
	}
	//普通方法，设置属性name
	public static void setName(int index,String name) {
		for (NewFruit f : NewFruit.values()) {
			if (f.getIndex() == index) {
				f.name=name;
				return;
			}
		}
	}
	//无参构造方法
	public int getIndex () {
		return index;
	}
	//普通方法getIndex，有参构造方法
	public static void setIndex(int index,String name) {
		for (NewFruit f : NewFruit.values()) {
			if (f.getName() == name ) {
				f.index =index ;
				return;
			}
		}
	}
	}
//主类DeepEnum
public class DeepEnum {
	public static void main(String[] args) {
		System.out.println("========================================");
		System.out.println("-----输出枚举中的元素-------");
		//通过调用方法得到对象的属性和序号
		System.out.println(NewFruit.APPLE.getIndex() + "-->" + NewFruit.APPLE.getName());
		System.out.println(NewFruit.BANANA.getIndex() + "-->" + NewFruit.BANANA.getName());
		System.out.println(NewFruit.ORANGE.getIndex() + "-->" + NewFruit.ORANGE.getName());
		
		System.out.println("---在自定义编号和属性值之后，测试-------");
		//改变对象的值
		NewFruit.setName(22, "心心相印");
		System.out.println("22-->" + NewFruit.getName(22));
		//改变对象的序号
		NewFruit.setIndex(11, "心心相印");
		System.out.println("11-->" + NewFruit.getName(11));
	}
}