package EnumMapDemo;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
enum MyFruitTest {苹果,橘子,香蕉,橙子};
public class EnumMapTest1 {
	public static void main(String[] args) {
		//遍历输出枚举数组原元素对应的编号（ordinal）
		MyFruitTest[] fr= MyFruitTest.values();
		for (MyFruitTest fruit : fr) {
			System.out.println(fruit.name() + "---" + fruit.ordinal());
		}
		//使用Enum类实现对键值的遍历
		//首先，创建EnumMapTest1类的对象eMap
		EnumMap<MyFruitTest, String> eMap =new EnumMap<>(MyFruitTest.class);
		//添加eMap元素
		eMap.put(MyFruitTest.苹果, "pg");
		eMap.put(MyFruitTest.橘子, "jz");
		eMap.put(MyFruitTest.香蕉, "xj");
		eMap.put(MyFruitTest.橙子, "cz");
		for (Map.Entry<MyFruitTest, String> ft : eMap.entrySet()) {
			System.out.println(ft.getKey() + "---" + ft.getValue());
		}
		System.out.println("-----------------------------");
		
		//测试EnumSet静态方法allOf()
		//定义EnumSet类型的对象eSet，并实例化
		//allof()用来将这个方法参数中所指向的全部内容设置到集合，在这里，MyFruitTest是allof方法的参数
		EnumSet<MyFruitTest> eSet=EnumSet.allOf(MyFruitTest.class);
		//定义了一个指向枚举类型MyFruitTest类型的迭代器
		Iterator<MyFruitTest> iter =eSet.iterator();
		while (iter.hasNext()) {
		System.out.println(iter.next());
		}
		System.out.println("================");
		//调用noneOf方法,表示MyFruit中一个元素不取
		EnumSet<MyFruitTest> eset=EnumSet.noneOf(MyFruitTest.class);
		Iterator<MyFruitTest> iter1= eset.iterator();
		while (iter1.hasNext()) {
			System.out.println(iter1.next());
		}
	}
}
