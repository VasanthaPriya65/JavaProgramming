import java.util.Scanner;

public class pg23_EvaluateExpression {
	public static void main(String[] args) {
		System.out.println("Enter the value of x : ");
		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
		int x1 = (++x - x++ + -x);

		System.out.println("Result of Expression [x1=(++x - x++ + -x)]");
		System.out.println(x1);
	}
}