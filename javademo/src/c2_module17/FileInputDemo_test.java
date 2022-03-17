package c2_module17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileInputDemo_test {

	public static void main(String[] args) {
		File file = new File("C:\\OMG\\色柴.jpg"); 
		File filetg = new File("C:\\OMGGG\\色柴copy.jpg"); 
		try(FileInputStream fis= new FileInputStream(file);
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream(filetg);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			 int data = 0;                  
			 while((data = fis.read())!=-1){ 
				 bos.write(data);
				 }
			 	 bos.flush();
				 System.out.println(" 欸黑! "); 
				
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("找不到檔案");
		}catch (IOException e) {
			e.printStackTrace();
			}
	}
}

