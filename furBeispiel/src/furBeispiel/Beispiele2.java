package furBeispiel;

public class Beispiele2 {

	public static void main(String[] args) {
	   
      int [][] arry2 = {
    		  {0},
    		  {1,2},
    		  {3,4,5},
    		  {6,7,8,9} };
      
      for (int i = 0 ; i<arry2.length;++i){
    	  for(int j= 0 ; j<arry2[i].length;++j){
    	  System.out.print(arry2[i][j]);
    	  }
    	  System.out.println("");
      }
	}

}
