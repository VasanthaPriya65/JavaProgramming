public class pg55_PrintCFormat {
public static void main(String[] args) {

	int n = 5;

	for(int i=0;i<n;i++) {
		System.out.print("*");
		for(int j=0;j<n-1;j++) {
			 if (i == 0 || i == n - 1)
	                System.out.print("*");
	            else
	                continue;
		}
		System.out.println();
	}
}
}