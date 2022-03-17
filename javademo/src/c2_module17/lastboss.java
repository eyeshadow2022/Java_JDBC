package c2_module17;

public class lastboss{

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0 ; i <1000; i++) {
					System.out.println(i);
				}
			}
		}; //隱式繼承 ， 建立執行續物件
		t1.start();
		
		for (int i = 0; i <1000;i++) {
			System.out.println("M+:" +i);
		}
	}

}
