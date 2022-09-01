import java.util.*;
public class pg21_EvaluateExpression {
	public static void main(String[] args) {
		System.out.println("Enter the value of x : ");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int z = (++y * (y++ + 5));
		System.out.println("Result of Expression [z = (++y * (y++ + 5));]");
		System.out.println(z);
	}
}