package EqualsMethod;

public class TestDemo{
	public static void main(String args[]) {
		int i[]={1,2,3,4,5,6};
		Object object =i;
		strict(i);
	}
	public static void strict(Object o) {
		if (o instanceof int[]) {
		int x[]= (int[])o;
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
	}
}
}
