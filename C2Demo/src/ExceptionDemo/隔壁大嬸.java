package ExceptionDemo;

public class 隔壁大嬸 {
	public void 跟她在菜市場吵架() throws Exception {
		int 會不會被刀砍 = (int)(Math.random()*100);//=>0~99
		if (會不會被刀砍<50) {
			throw new Exception("鳥屎了");
		}
		System.out.println("7pupu回家");
	}
	
	
}
