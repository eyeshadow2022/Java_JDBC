package c2_module17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {

	public static void main(String[] args) {
		File file = new File("C:\\新文字文件.txt"); //建立檔案物件
		//FileInputStream fis = null; // 宣告FileInputStream物件的變數
		try(FileInputStream fis= new FileInputStream(file)) {
		//	 fis = new FileInputStream(file); //建立FileInputStream物件
			 int data = 0;                   //提供讀取資料變數
			 while((data = fis.read())!=-1);{ //當回傳值為-1的時候表示結尾
				 System.out.println(Integer.toHexString(data)+" "); //印出讀到的數據
				 byte[] b = new byte[1]; //因為字串只能藉由幾種方式讀取(如byte陣列)
				 b[0]=(byte)data; // //所以使用byte陣列進行印出的動作
				 System.out.println(new String(b));
			 }
			 fis.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("找不到檔案");
		}catch (IOException e) {
			e.printStackTrace();
//		}finally {
//			try {
//				fis.close();
//			}catch (IOException e) {
//				e.printStackTrace();
//			}
		}

	}

}
