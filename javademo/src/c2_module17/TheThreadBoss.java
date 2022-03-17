package c2_module17;


public class TheThreadBoss {

	public static void main(String[] args) {
		TObj1 t2 = new TObj1();
		TObj1 t3 = new TObj1();
		t2.start();
		t3.start();
		
		try {
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t2.myMoney);
		System.out.println(t3.myMoney);
	}

}
