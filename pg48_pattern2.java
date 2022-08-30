public class pg48_pattern2 {
	public static void main(String args[]) {
	
		int n = 9;
		for (int i = 9; i >0; i--) {
	 
			for (int j=1;j<=n;j++) {
				System.out.print(" ");
			}
	
			for ( int j=i;j<=9;j++)
			{
				System.out.print(j);
			}
			int k=8;
			for (int j=i+1;j<=9;j++)
			{
				System.out.print(k);
				k--;
			}
			
			n--;
			System.out.println("\n");
		}
}
}

	
