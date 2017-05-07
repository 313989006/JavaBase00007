package ClassExtendsTest;

	//使用构造函数实现对数据的封装
class MyCat {
	//创建私有化属性
	private float weight;
	private float height;
	//在构造函数中初始化私有变量
	public MyCat(float weight,float height) {
	SetHeight(height);
	SetWeight(weight);
	}
	//创建私有化方法-设置重量属性的值
	//通过private修饰符，封装类的get方法
	private void SetWeight(float wt) {
		if (wt > 0) {
			weight = wt;
		} else {
			System.out.println("weight设置非法,应该>0,\n采用默认值10");
			weight =10.0f;
		}
	}
	//创建私有化方法-设置高度属性的值
	//通过private修饰符，封装类的get方法
	private void SetHeight(float ht) {
		if (ht > 0 ) {
			height = ht ;
		} else {
			System.out.println("height 设置非法,应该大于0,\n采用默认值20");
			height =20.0f;
		}
	}
	//无参构造方法，修饰符 + 返回值类型 + 方法名（）｛｝
	//创建共有方法作为与外界的通信的接口
	public float GetWeight() {
		return weight;
	}
	public float GetHeight() {
		return height;
	}
}
public class Test2 {
	public static void main(String[] args) {
	MyCat mt = new MyCat(15,-10);
	float wt=mt.GetWeight();
	float ht=mt.GetHeight();
	System.out.println("这只猫的重量是 : " + wt);
	System.out.println("这只猫的高度是 : " + ht);
	}
}
