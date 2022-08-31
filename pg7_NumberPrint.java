import java.util.Scanner;

public class pg7_NumberPrint {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int cnt = 1;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j || i + j == size - 1) {
					System.out.print(cnt);
				} else {
					System.out.print(" ");
				}
			}
			cnt = cnt + 1;
			System.out.println();
		}
	}
