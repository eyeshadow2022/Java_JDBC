package module7;

public class m7_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("100+3="+(100+3));
		System.out.println("100-3="+(100-3));
		System.out.println("100*3="+(100*3));
		System.out.println("100/3="+(100/3d));
		System.out.println("100%3="+(100%3));
		Object o = (100/3d);
		System.out.println(o.getClass().getSimpleName());
		int a = 5;
		double b = 10;
		Object c = (a/b);
		System.out.println(c.getClass().getSimpleName());
		float d = 5;
		double e = 10;
		Object f = (d/e);
		System.out.println(f.getClass().getSimpleName());
		short g = 5;
		byte h = 10;
		Object i = (g/h);
		System.out.println(i.getClass().getSimpleName());
		long j = 5;
		float k = 10;
		Object l = (j/k);
		System.out.println(l.getClass().getSimpleName());
//		
	}

}
