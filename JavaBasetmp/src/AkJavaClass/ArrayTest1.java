package AkJavaClass;

public class ArrayTest1 {
	static int[] oldarr={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
	int[] newarr=new int[12];
	public static void ch(int[] oldarr) {
		for (int i = 0; i < oldarr.length; i++) {
			if (oldarr[i] == 0) {
				ArrayTest1.oldarr.getClass();
				System.out.println("数组中为0的是第 " + (i+1) + " 个元素 ");
				continue;
			} 
		}
	}
	public static void ArrayWork(int[] oldarr) {
		for (int i : oldarr) {
			System.out.print( i + " ");
		}
	}
	public void SelectArr(int[] newarr, int i) {
		if (oldarr[i] != 0) {
			
		} else {

		}
	}
	public static void main(String[] args) {
		System.out.println("数组的总长度为 : " + oldarr.length);
	ch(oldarr);
	System.out.println("删除0之前的数组是 : " );
	ArrayWork(oldarr);
	}
	}
