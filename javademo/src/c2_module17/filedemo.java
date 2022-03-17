package c2_module17;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class filedemo {

	public static void main(String[] args) {

	//	File file = new File("C:\\_Java\\新資料夾(87)"); //mkdir
//		File file = new File("./新資料夾(87/a/b/c/d/e/f");
//		//mkdirs[ ./ ]在跟目錄建立
//		file.mkdirs(); 	//只能建議第一層的資料夾，mkdirs 可建立多層
//		System.out.println("建立成功");
		
		SimpleDateFormat df = new SimpleDateFormat ("YYYYMMDD");
		String path = "./新資料夾(87/a/b/c/d/e/f/g.txt";
		File file = new File(path);
		System.out.println(path+" 是否存在:"+file.exists());
		file.getParentFile().mkdirs();
		
		try {
			file.createNewFile(); //檔案要能夠建立需要付資料夾的存在
		} catch (IOException e) {
			System.out.println("檔案無法建立");
		}
		System.out.println("執行完成");
	}

}
