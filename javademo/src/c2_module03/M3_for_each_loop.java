package c2_module03;

public class M3_for_each_loop {

	public static void main(String[] args) {
		int[][] intListList= {{1,2,3},{4,5,6},{7,8,9}};
		//for(元素:疊代對象)
		for (int[] 一維陣列 : intListList) {
			for(int 一個整數:一維陣列) {
				System.out.print(一個整數+",");
		}
			System.out.println();
	}

	}
}
