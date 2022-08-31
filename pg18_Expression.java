import java.util.Scanner;

public class pg18_Expression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a = sc.nextInt();
		System.out.println("Enter value of b:");
		int b = sc.nextInt();
		int x;
		// i) x=++a-b-; Invalid expression because at the end it has single - sign which
		// is not valid
		// ii) a%b++;
		x = a % b++;
		System.out.println(x);

		// iii)a*=b+5
		a *= b + 5;
		System.out.println(a);

		// iv)x=69>>>2
		x = 69 >>> 2;
		System.out.println(x);
	}
}