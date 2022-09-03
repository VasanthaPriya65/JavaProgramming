public class pg5_AlphabetPattern {

	public static void main(String[] args) {
		int i, j;
		System.out.println("Enter the Alphabet");
		Scanner sc = new Scanner(System.in);
		char Str = sc.next().charAt(0);
		
		int chrNum = (int) Str;
		
		for (i = chrNum; i > 64; i--) {
			for (j = 64; j < i; j++) {
				System.out.print((char) (i));
			}
			System.out.println("");
		}

	}

}