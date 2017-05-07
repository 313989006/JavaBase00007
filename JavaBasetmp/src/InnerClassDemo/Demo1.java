package InnerClassDemo;
	//内部类和外部类的使用
	class Outer{
		int score = 95;
		void inst(){
			Inner in =new Inner();
			in.display();
		}
		/*//类内部类，也成为静态内部类
		public static class Inner1{
			
		}*/
		//内部类
		class Inner{
			String name="安徽农业大学";
			void display(){
				System.out.println("姓名 : "+ name +",成绩是 :score = " + score);
			}
		}
	}
public class Demo1 {
	public static void main(String[] args) {
		Outer outer =new Outer();
		outer.inst();
	}
}
