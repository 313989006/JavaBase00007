package BookTestDemo;

public class CeShi2 {

	public static void main(String[] args) {
		/*int a=5;
		if (a%2 == 1 || a% 2 == -1) {
			System.out.println(a + " 是奇数！");
		}else {
			System.out.println(a + " 偶数");
		}*/
		int a = 100;
		int b = 7;
		char oper ='*';
		switch(oper){
		case '+':
			System.out.println(a + " + " + b + " = " + ( a + b ));
			break;
		case '-':
			System.out.println(a + " - " + b + " = " + ( a - b ));
			break;
		case '*':
			System.out.println(a + " * " + b + " = " + ( a * b ));
			break;
		case '/':
			System.out.println(a + " / " + b + " = " + ( a / b ));
			break;
		default:
			System.out.println("未知的操作!");
		break;
		}

	}

}
