package c2_module17;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo2 {

	public static void main(String[] args) {
		File file = new File("C:\\色柴.jpg");
		try (FileInputStream 志展= new FileInputStream(file);
			BufferedInputStream 元輝 = new BufferedInputStream(志展)){
		int data = 0;                 
			 while((data = 元輝.read())!=-1){ 
				 System.out.println(Integer.toHexString(data));
				 }
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("找不到檔案");
		}catch (IOException e) {
			e.printStackTrace();

		}

	}

}
