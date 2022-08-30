public class pg47_pattern1 {
	public static void main(String args[]) {
	
		String Str="";
		int n = 8;
		for (int i = 0; i <=9; i++) {
		
			for (int j=1;j<=n;j++) {
				System.out.print(" ");
			}
	
			for ( int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
	
			for ( int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println("\n");
			n--;
		}

	}
}