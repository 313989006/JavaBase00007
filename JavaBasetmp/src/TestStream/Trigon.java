package TestStream;


import java.text.BreakIterator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Trigon {

	public static void main(String[] args) {
	
		//Scanner input = new Scanner(System.in);
		int m=-2,l=-5;
		//默认为-1，  只要不是int型的都行
		boolean isEx ;
		//先确定一个布尔型  让其默认为错误

		do {
			Scanner input = new Scanner(System.in);
			//这条语句放在循环里面 必选死循环
			//System.out.println("请输入2個正确的数值：");
			try {
				System.out.println("请输入行数");
				m = input.nextInt();
				System.out.println("请输入要平移几行");
				l= input.nextInt();
				isEx =false;
			} catch (Exception e) {
				System.out.println("请重新输入2個正确的数值：");
				isEx = true;
				//如果这条语句执行的话那就是让代码从新循环
			}

		} while (isEx);


		for (int a = 0; a < m; a++) {
			//先确定行  
			for (int b = 0; b < m - a + l; b++) {
				System.out.print(" ");
				//确定打印空格的个数
			}
			for (int c = 0; c < 2 * a + 1; c++) {
				if (c == 0 || c == 2 * a) {
					System.out.print("*");
					//边界打印空格
				} else
					System.out.print(" ");
				// 其他的还是打印空格
			}

			System.out.println();
		}
		//单独确定最后一行
		for (int k = 0; k < 2 * (m + l) + 1; k++) {
			if (k < l || k > 2 * m + l) {

				System.out.print(" ");
			} else
				System.out.print("*");

		}
	}
}
