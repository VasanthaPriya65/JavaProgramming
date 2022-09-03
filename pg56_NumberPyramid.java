public class pg56_NumberPyramid {
	public static void main(String[] args) {
		int rows = 4, number = 1;
		for (int i = 1; i <= rows; i++) {
			for (int k = rows; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				++number;
			}
			System.out.println();
		}
	}

}