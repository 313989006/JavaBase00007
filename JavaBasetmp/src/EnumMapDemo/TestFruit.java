package EnumMapDemo;

public class TestFruit {
	public static void main(String[] args) {
	//for-each循环遍历NewFruit的属性值，得到
	for (NewFruit2 nf : NewFruit2.values()) {
		System.out.println(nf.ordinal() + "-->" + nf.name() + " : " + nf.getFruit());
	}
	}
}
