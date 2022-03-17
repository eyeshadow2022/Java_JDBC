package c2_module16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		//ArrayLis => 好處是收尋速度快，新增刪除速度慢
		//LinkedList => 新增刪除速度快，收尋速度慢
		//List strList= new ArrayList();//alt+shift+o=>自動import
		List<String> strList = new LinkedList<>();
		strList.add("絲襪奶茶");
		strList.add("錫蘭紅茶");
		strList.add("原萃");
		strList.add(1, "印度拉茶");
		Integer i = 1;
		int i2=i;
		Integer i3=i2;
		System.out.println(strList.get(2));
	//	System.out.println(strList);
	//	strList.remove("海南雞飯");
	//	strList.remove(0);//移除索引值為0的東西
		Object o = strList.set(0, "不健康紅茶");
		System.out.println(strList); //索引值從0開始
		System.out.println(o);
		System.out.println(strList.size());
		
	}

}
