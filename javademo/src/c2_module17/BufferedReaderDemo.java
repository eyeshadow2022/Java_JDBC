package c2_module17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("C:\\OMG\\新文字文件.txt");
				BufferedReader br = new BufferedReader (fr)){
					String c = "";
					while((c = br.readLine())!=null) {
							System.out.println(c);
					}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	


	}
}