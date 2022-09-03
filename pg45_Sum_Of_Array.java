import java.util.Arrays;
import java.util.Scanner;

public class pg45_Sum_Of_Array {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int length = sc.nextInt();

		int[] Arr = new int[length];
		System.out.println("Enter the elements of the array:");

		for (int i = 0; i < length; i++) {
			Arr[i] = sc.nextInt();
		}

		System.out.println("Given Array : " + Arrays.toString(Arr));

		System.out.println("Sum of Array : " + Arrays.stream(Arr).sum());
	}
}