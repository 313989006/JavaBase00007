package BookTestDemo;
		//局部变量在取值操作前必须初始化或者赋值操作
public class TestLocalVar1 {
	static void Lpt(){
		int i,j,n;
		i = 100;
		j = 1;
		n = 2;
		while (i>0){
			System.out.println("The value is = "+ j);
			n =n+1;
			i--;
		}
	}

	public static void main(String[] args) {
		Lpt();
}
}
