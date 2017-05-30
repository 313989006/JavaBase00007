package EqualsMethod;

abstract class Bird {
	private String name;

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public abstract int fly();
}

public class AnonymousInnerClass {
	public void test(Bird bird) {
		System.out.println(bird.getname() + "最高能飞" + bird.fly() + "米");
	}

	public static void main(String[] args) {
		AnonymousInnerClass tt = new AnonymousInnerClass();
		/*//先创建Bird类的一个实例，再调用test()方法
		Bird bird =new Bird() {
			
			@Override
			public int fly() {
				return 1000;
			}
			public String getname() {
				return "小鸟";
			}
		};
		tt.test(bird);*/
		
		//调用test()方法同时new一个实例
		tt.test(new Bird() {
			@Override
			public int fly() {
				return 1000;
			}

			public String getname() {
				return "小鸟";
			}
		});
	}
}
