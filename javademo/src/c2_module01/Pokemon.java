package c2_module01;

public class Pokemon {
	String name;
	double height;
	double weight;
	String abilities;
	String category;
	String gender;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("物件以回收"+this.name);
		super.finalize();
	}
}
