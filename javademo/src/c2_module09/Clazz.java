package c2_module09;

import java.io.Serializable; //序列化

public class Clazz implements Serializable{
	
	public String publicString = "I am public";
	protected String protectedString = "I am protected";
	String defaultString = "I am default";
	private String privateString = "I am private";
	
	public static void main(String[] args) {
		Clazz clazz = new Clazz();
		System.out.println(clazz.publicString);
		System.out.println(clazz.protectedString);
		System.out.println(clazz.defaultString);
		System.out.println(clazz.privateString);
		clazz.A();
	}
	
	public  void A() {
		
	}
}
