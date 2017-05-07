package ClassExtendsTest;
	//私有化属性，
class myCat1{
		private static float weight;   //通过private修饰符，封装myCat的属性
		public static void SetW(float wt1) {
			if (wt1 > 0 ) {
				weight =wt1;
			} else {
			System.out.println("weight设置非法,应该大于0,\n采用默认值");
			weight =10.0f;
			}
		}
		public float GetW() {
			return weight;
		}
	}
public class TestCat {
	public static void main(String[] args) {
	myCat1 mc =new myCat1();
	mc.SetW(-10f);   //设置myCat的属性值
	
	float temp=mc.GetW();
	System.out.println(" 这只猫的重量是 : " + temp);
	}
}
