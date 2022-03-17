package module9;

import java.util.Scanner;

public class M9_test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入您的年齡:");
		String ageStr = sc.next();

		Integer age = Integer.valueOf(ageStr);
		if (age <= 12) {
			System.out.println("半票");
		} else if (age <= 60) {
			System.out.println("全票");
		} else {
			System.out.println("敬老票");
		}
	}

}
