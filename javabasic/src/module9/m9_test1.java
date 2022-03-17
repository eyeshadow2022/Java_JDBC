package module9;

import java.util.Scanner; // 會自動補上這條(ctrl+shift+o)

import javax.swing.JOptionPane;

public class m9_test1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //ctrl+shift+O ↑
		System.out.println("輸入一個數值:");
		String name = sc.next(); // alt+shift+L 補上等號左式
//		String name2 = JOptionPane.showInputDialog("輸入您的大名:");
		Integer num = Integer.valueOf(name);
		++num;
		System.out.println(num);
		
	}

}