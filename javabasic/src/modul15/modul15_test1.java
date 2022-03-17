package modul15;

public class modul15_test1 {

	public static void main(String[] args) {
		String a ="a";
		String a2 ="a";
		String a3 = new String ("a");
		char[] a4c = {'a'};
		String a4 = new String (a4c);
		
		System.out.println(a.equals(a2));
		System.out.println(a.equals(a3));
		System.out.println(a.equals(a4));
		System.out.println(a.equals(a3));
		System.out.println(a.equals(a4));
		System.out.println(a.equals(a4));
		
		String q = "String資料型別是不是blablabla";
		
		System.out.println("q長度"+q.length());
		System.out.println(q.indexOf("資料"));
		System.out.println(q.substring(6));
		System.out.println(q.substring(6, 8));
		
		
	}

}
