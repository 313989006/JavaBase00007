package EnumMapDemo;
enum WeekDay{MonDay,TuesDay,WedsDay,ThursDay,FriDay,SaturDay,SunDay};
public class Exercise1 {
	public static void main(String[] args) {
	WeekDay wd= WeekDay.MonDay;
	switch (wd) {
	case MonDay:
		System.out.println("Do Monday Work");
		break;
	default:
		System.out.println("I dont know which is day");
		break;
	}
	}
}
