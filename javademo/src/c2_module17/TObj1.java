package c2_module17;

public class TObj1 extends Thread{

	static int money = 100000;
	int myMoney = 0;
	public static synchronized boolean getMoney() {
		if (money > 0 ) {
			money--;
			return true;
		} else {
			return false;
		}
	}
	@Override
	public void run() {
		while (this.getMoney()) {
			this.myMoney++;
		}
	}
}
