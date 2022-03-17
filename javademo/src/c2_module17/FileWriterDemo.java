package c2_module17;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("C:\\OMG\\新文字文件.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos,"MS950");
				BufferedWriter bw = new BufferedWriter(osw)){
		
//		try (FileWriter fw = new FileWriter("C:\\OMG\\新文字文件.txt");
//				BufferedWriter bw = new BufferedWriter (fw)){
					bw.write(" 我想，把史迪奇的意義想清楚，對各位來說並不是一件壞事。可是，即使是這樣，"
							+ "史迪奇的出現仍然代表了一定的意義。在這種困難的抉擇下，本人思來想去，寢食難安。 ");
					bw.flush();
//			fw.write("美朝健康綠茶");
//			fw.flush();
			System.out.println("喔K");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	


	}
}