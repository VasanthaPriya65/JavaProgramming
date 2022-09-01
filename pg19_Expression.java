import java.util.Scanner;

public class pg19_Expression {
	public static void main(String[] args) {
		System.out.println("Enter the value of a : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		// (a+=a++ + ++a + -a + a-) is showing error
		a += a++ + ++a + -a + a--;
		System.out.println("Result of Expression (a += a++ + ++a + -a + a--)");
		System.out.println(a);
	}
}