package ClassExtendsTest;

import java.util.ArrayList;
		//返回引用数据应该注意的问题
class TestReturn{
		//定义一个私有的ArrayList属性
		private ArrayList<Integer> intArray =new ArrayList<Integer>();
		//无参构造方法
		public TestReturn() {
			//通过构造函数对其进行初始化
			intArray.add(1);
			intArray.add(2);
			intArray.add(3);
		}
		//设置该私有数据对应的get方法
		ArrayList<Integer> getIntArray(){
			return intArray;
		}
}
public class ReturnVariale {
	public static void main(String[] args) {
		//实例化TestReturn类，定义一个testReturn对象
		TestReturn testReturn = new TestReturn();
		//得到该私有数据，不是副本，而是引用
		ArrayList<Integer> intArray=testReturn.getIntArray();
		System.out.println(intArray.size());
		
		intArray.add(4);
		ArrayList<Integer> intArray2=testReturn.getIntArray();
		//该类内部的私有变量已经被改变
		System.out.println("在其外部修改其私有变量以后其长度为 : " + intArray2.size());
	}
}
