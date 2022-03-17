package modul12;

import javax.swing.JOptionPane;


public class modul12_test2 {

	public static void main(String[] args) {
		
		int i = 0 ;
		do {
			 String s = JOptionPane.showInputDialog("請輸入成績");
			 i=Integer.parseInt(s);
			 if (i>=60) {
				 System.out.println("及格");
			 }else {
				 System.out.println("不及格");
			 }
			
		}while(i<=60);
	}

}
