package c2_module10;

public class HelloWorld {
	
	public static void main(String[] args) {
		HelloWorld h = new HelloWorld();
		HelloWorld h2 = new HelloWorld();
		System.out.println("Hell World!!");

	}
	static {
		System.out.println("hello static~");
	} // "類別" 內部的初始化 [!!***不是物件***!!]
	
	{
		System.out.println("Hello non-stactic!");
	} // "物件" 內部的初始化
}
