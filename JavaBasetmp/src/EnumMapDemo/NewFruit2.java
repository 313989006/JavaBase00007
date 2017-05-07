package EnumMapDemo;

	//实现了FruitInterface接口，必须实现接口里的所有方法
enum NewFruit2 implements FruitInterface
{
	//每个枚举对象都要实现所定义的抽象方法
	苹果{
		public String getFruit() {
			return "APPLE";
		}
	},
	香蕉{
		public String getFruit() {
			return "BANANA";
		}
	},
	橘子{
		public String getFruit() {
			return "ORANGE";
	}
};
}
