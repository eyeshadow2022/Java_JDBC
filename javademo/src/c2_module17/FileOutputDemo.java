package c2_module17;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileOutputDemo {

	public static void main(String[] args) {
		File file = new File ("C:\\OMG\\新文字文件.txt");
		try (FileOutputStream fos = new FileOutputStream(file);
				BufferedOutputStream bo = new BufferedOutputStream(fos)){
			String str= "亞瑟王石中劍";
			byte [] bytes = str.getBytes();
			fos.write(bytes);
			System.out.println("燈愣!");
	}catch (FileNotFoundException e ) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}

}}
