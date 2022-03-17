package module7;

public class M7_test3 {

	public static void main(String[] args) {
//		int i = 1;
//		boolean b = 1 == 2 & ++i > 2;
//		System.out.println(i);
	}

	public static int add(int a, int b) {
		while (true) {
		if (b == 0) {
			return a;
		}
		if (a == 0) {
			return b;
		}
		int sum = a ^ b;
		int temp = a & b;
		int carry = temp << 1;
		a = sum;
		b= carry;
		//return add(sum, carry); // 遞迴
	}
}
}
