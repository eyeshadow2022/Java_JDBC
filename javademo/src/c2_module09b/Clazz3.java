package c2_module09b;

import c2_module09.Clazz;

public class Clazz3 extends Clazz {

	public Clazz3() {
		super();
		super.publicString=""; 
		//Calzz - public [final] String publicString
	}

	public static void main(String[] args) {
		Clazz3 clazz = new Clazz3();
		System.out.println(clazz.publicString);
		System.out.println(clazz.protectedString);
//		System.out.println(clazz.defaultString);
//		System.out.println(clazz.privateString);

	}
@Override
public void A() {
	super.A();
}
}

