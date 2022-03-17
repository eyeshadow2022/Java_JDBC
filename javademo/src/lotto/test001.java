package lotto;

public class test001 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		  for(int i=0;i<6;i++){
		   lotto[i]=(int)(Math.random()*49+1);   
		   for(int j=0;j<i;j++){
		    if(lotto[i]==lotto[j]){
		    	lotto[i]=(int)(Math.random()*49+1); 
		    }   
		   }   
		  }
		  System.out.println("中獎號碼:");
	       for(int i=0;i<6;i++){
		   System.out.print(lotto[i]+" , ");
	}

}
}