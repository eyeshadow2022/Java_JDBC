package c2_module03;

public class M3_LAB {

	public static void main(String[] args) {
		int[][] arr1= {{1,2},{3,4},{5,6},{7,8}};
		int[][] ans=new int[2][4];
		
		for(int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				ans[j][i]=arr1[i][j];
			}
		}
				
		for(int[]is: ans) {
			for (int i : is) {
				System.out.print(i+",");
			}
			System.out.println();
		}
		//ans={{1,3,5,7,},{2,4,6,8}}
	}

}
