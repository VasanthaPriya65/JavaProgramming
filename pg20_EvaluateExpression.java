import java.util.*;
public class pg20_EvaluateExpression {
	public static void main(String[] args) {
		System.out.println("Enter the value of x : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		x = x++ * 2 + 3 * -x;
		System.out.println("Result of Expression (x = x++ * 2 + 3 * -x;)");
		System.out.println(x);
	}
}