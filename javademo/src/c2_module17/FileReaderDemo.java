package c2_module17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("C:\\OMG\\新文字文件.txt")){
			int c = 0;
			while((c=fr.read())!=-1){
				System.out.println((char)c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
