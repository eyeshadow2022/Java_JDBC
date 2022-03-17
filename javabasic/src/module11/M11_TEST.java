package module11;
//1+1+2+3+....+100 = ?
public class M11_TEST {

	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 100; i++) // i+=1 也可以
		{
			total += i;
		}
		System.out.println("total=" + total);
		
	}

}
