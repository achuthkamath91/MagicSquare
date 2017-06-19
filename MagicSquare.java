package work;

import java.util.Arrays;

public class MagicSquare {
	private static int[][] square;
	public static void magicSquare(int no){
		
		square = new int[no][no];
		for (int[] row: square)
		    Arrays.fill(row, 0);
		int i = no/2;
		int j = no-1;
		
		for(int number=1;number<=no*no;){
			if (i==-1 && j==no) //3rd condition
	        {
	            j = no-2;
	            i = 0;
	        }else{
	            //1st condition helper if next number goes to out of square's right side
	            if (j == no)
	                j = 0;
	            //1st condition helper if next number is goes to out of square's upper side
	            if (i < 0)
	                i=no-1;
	        }
			if (square[i][j]!=0) //2nd condition
	        {
	            j -= 2;
	            i++;
	            continue;
	        }
	        else
	        	square[i][j] = number++; //set number
	 
	        j++;  i--; //1st condition
		}
		
		
		 for(i=0; i<no; i++)
		    {
		        for(j=0; j<no; j++)
		        	System.out.print(square[i][j]+" ");
		        System.out.println("");
		    }
		 //System.out.println("\n");
 	}
	
	public static void main(String[] args){
		System.out.println("Magic square of Size 3!!");
		magicSquare(5);
	}
	
}
