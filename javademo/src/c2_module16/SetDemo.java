package c2_module16;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
	//	Set strSet = new HashSet();
		Set<String> strSet = new HashSet<>();
		strSet.add("香蕉");
		strSet.add(new String("香蕉"));
		strSet.add("蘋果");
		System.out.println(strSet); 
		for (Object object : strSet) {
			System.out.println(object);
		}
//		System.out.println(strSet.contains(new String("蘋果")));
		System.out.println(strSet.remove(new String("蘋果")));
		System.out.println(strSet.isEmpty());
		System.out.println(strSet.size());
		strSet.clear();
		System.out.println(strSet.isEmpty());

		System.out.println(strSet); //沒有排序
	}

}
