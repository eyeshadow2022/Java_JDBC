package module11;

public class M11_test3 {

	public static void main(String[] args) {
	Z:	for (int i =1; i<10;i+=1) {
			for(int j=2; j<10;j+=1) {
				if(i==5)continue Z; // break、continue
				// Z標籤的用法,但不限定叫什麼banana也可
				System.out.print(j+"X"+i+"="+(j*i)+"\t");
			}
			System.out.println();
	}

}
}
