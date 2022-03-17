package module7;

public class m7_test2 {

	public static void main(String[] args) {
		int age  = 0b1100;
		int age2 = 0b1010;
		System.out.println(Integer.toBinaryString(age&age2));
		System.out.println(Integer.toBinaryString(age|age2));
		System.out.println(Integer.toBinaryString(age^age2));
		System.out.println(Integer.toBinaryString(~age));
		
		
//		int age = 28;
//		System.out.println(age >= 18);
//		if (age >= 18) {
//			System.out.println("please enter");
//		} else {
//			System.out.println("please leave");
//		}

		// 範圍在15<x<60之間
//		int age = 15;
//		if (age < 60 && age > 15) {
//			System.out.println("全票");
//		} else {
//			System.out.println("半票");
//		}
	}

}
