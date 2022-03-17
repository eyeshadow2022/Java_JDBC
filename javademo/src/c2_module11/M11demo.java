package c2_module11;

import c2_module08.鴨子;
import c2_module08.史丹利;
import c2_module08.機器人;


public class M11demo {

	public static void main(String[] args) {
		鴨子 鴨 = new 鴨子();
		鴨.name = "鴨";
		史丹利 史丹利 = new 史丹利();
		史丹利.name="史丹利";
		鴨子[] dk = {鴨 ,史丹利, new 機器人()};
		dk[2].name="機器人"; //單純幫機器人取名子
		
		for (鴨子 a : dk) {
			//a.嘎嘎叫();
			if (a instanceof 鴨子) {
				System.out.println(a.name+"是一隻鴨子");
			}
			if (a instanceof 史丹利) {
				System.out.println(a.name+"是史丹利");
				史丹利 st=(史丹利)a;
				st.哭阿();
			}
			if (a instanceof 機器人) {
				System.out.println("ban不見");
			}
		}
		

	}

}
