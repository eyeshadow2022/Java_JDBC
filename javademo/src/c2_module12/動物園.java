package c2_module12;

public class 動物園 {

	public static void main(String[] args) {
		動物 m = new 猴子();
		動物 f = new 魚();
		
		動物[] a = {m,f};
		for (動物 動物 : a) {
			動物.睡覺();
		}

	}

}
