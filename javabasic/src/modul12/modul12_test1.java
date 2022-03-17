package modul12;

public class modul12_test1 {

	public static void main(String[] args) {
//		int i = 1;
//		while(i<=20) {
//            System.out.println(i+=1);
//		}
		//當寫到while迴圈時，先設定好離開條件。不然會變成無限迴圈。
		//while屬於"前側迴圈"
		//意指執行迴圈裡面的內容前，會先進行測試條件判斷
		//通常執行長度不一定且沒有規則性的，但有結束條件
		
		int count = 1;
		int total = 0;
		while(count<=50) {
			total+=count;
			count++;
		}
		System.out.println("結果:"+total);
	}

}
