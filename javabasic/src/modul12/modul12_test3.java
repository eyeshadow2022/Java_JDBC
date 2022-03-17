package modul12;

import javax.swing.JOptionPane;

public class modul12_test3 {

	public static void main(String[] args) {
		int i = 0;
		String s = JOptionPane.showInputDialog("請輸入成績");
	    i = Integer.parseInt(s);
		while(i<=60) {
			System.out.println("不及格，請重考");
			s = JOptionPane.showInputDialog("請輸入成績");
		    i = Integer.parseInt(s);
		} System.out.println("及格");

	}

}
