package OverLoadDemo;

public class TestSingleDemo {

	public static void main(String[] args) {
		//声明一个Person1类的对象
		Person1 pe;
		//虽私有化Person类的构造方法，但可通过Person类公有接口获得Person实例化对象
		pe=Person1.getPerson();
		//Person1 per=new Person();  //不能通过私有化的构造方法实例化对象
		System.out.println("姓名 : " + pe.name);
	}
}
class Person1
{
	//声明变量
	String name;
	//在本类中声明Person对象PERSON，注意此对象用final标记，表示该对象不可更改
	private static final Person1 PERSON =new Person1();
	private Person1(){
		name ="kehr";
	}
	public static Person1 getPerson(){
		return PERSON;
	}
}
