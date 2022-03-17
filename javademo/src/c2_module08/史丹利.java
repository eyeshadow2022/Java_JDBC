package c2_module08;

public class 史丹利 extends 鴨子 {
//人雖然會游泳，但程式上的邏輯不對，因人不是魚。

//ex2
//public class 史丹利 extends 鴨子 {
//不當繼承
//上下層關西必非是包含在內的關西(史丹利實際上並不是鴨子)
//在未來上層類別發生改動的時候
//子類別有極大的可能性將無法再使用該方法
//以至於程式中有不當繼承行為的類別都需被修改
//
//使用繼承時應當謹慎注意是某有完整的上下階層關聯性
//}
@Override
public void 嘎嘎叫() {
	//super.嘎嘎叫();
	System.out.println("嘎嘎 哭阿! 史黑");
}


public void 哭阿() {
	System.out.println("哭阿!你他媽是史黑吧!");
	}
	
	
}