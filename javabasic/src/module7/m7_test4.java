package module7;

public class m7_test4 {

	public static void main(String[] args) {
		int i = 5;
		i+=10; //類似英文縮寫gotta; 原為:i=i+10,答為110
		System.out.println(i);
		//----分----隔----線----
		System.out.println(i>100?"apple":"banana");
		//上排與下排執行結果一樣,
		//差別在於上排可以當作一個物件(下兩排
		String s=i>100?"apple":"banana";
		System.out.println(s);
		//
		if(i>100) {System.out.println("apple");
		}else{
			System.out.println("banana");
		}
	}

}
