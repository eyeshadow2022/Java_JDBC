package c2_module16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapdemo {

	public static void main(String[] args) {
//		Map strMap = new HashMap();
		Map<String,String>strMap = new HashMap<>();	
		strMap.put("台北中正區","100");
		strMap.put("台北大安區","106");
		strMap.put("台南市東區", "701");
		strMap.put("台南市西區", "703");
		strMap.put("高雄市新興區", "800");
		
		strMap.remove("台南市西區");
		System.out.println(strMap.get("台南市東區"));
		Set keySet = strMap.keySet();
		for (Object object : keySet){
			System.out.println("key="+object+",value="+strMap.get(object));
		}
		System.out.println();
		Set entrySet = strMap.entrySet();
		for (Object object : entrySet) {
			Entry e =(Entry) object;
			System.out.println("key="+e.getKey()+",value="+e.getValue());
		}
		System.out.println(strMap);
		System.out.println(strMap.size());
		

	}

}
