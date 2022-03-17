package c2_module04;
//示範用
//應該怎麼寫
public class M4_demo1 {
	
	private int a =100;
	public static int a2=100;
	//相加
	public int  addNum(int a, int b) {
	//動詞開頭
	int c= a+b;
	this.setA(0);
	this.a2=50;
	return c;
//這段沒辦法寫在main裡面，但可以寫在類別裡面，但不推薦這樣寫
}
//印出
	public void print (int a){
		System.out.println(a);
		System.out.println("a2="+this.a2);
		return;

	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
}
