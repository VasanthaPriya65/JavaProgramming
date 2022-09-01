
public class pg50_pattern4 {
	public static void main(String args[]) {
	
	    for(int i = 9; i >=1; i--) {
	    	
	    	for (int k =9;k>=i;k--)
			{
				System.out.print(" "); 
			}
			
			 for(int j = i; j >=1; j--) 
			 	{
				    System.out.print(i + " ");
				   
			 	}

	      System.out.println();
	    }

	}
}