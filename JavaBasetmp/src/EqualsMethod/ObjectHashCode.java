package EqualsMethod;
	//比较两个对象的hashCode()值
public class ObjectHashCode {
	public static void main(String[] args) {
		/*Person P1 = new Person(1, "小马");
		Person p2 = new Person(1, "小马");
		Person p3 = new Person(2, "小康");
		System.out.println(P1.equals(p2));
		System.out.println(P1.equals(p3));
		System.out.println(P1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		//重写equals()方法之后，比较的不再是对象地址，而是对象内容，所以p1==p2，p1，p2的哈希码值相等
*/	
		//直接重写equals()方法判断
		Person t_p1= new Person("张三", 20);
		Person t_p2= new Person("张三", 20);
		System.out.println(t_p1.equals(t_p2)? "是同一个人" : "不是同一个人");
	}
}
