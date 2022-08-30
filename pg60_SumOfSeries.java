import java.util.Arrays;
import java.util.Scanner;

public class pg60_SumOfSeries {
	public static void main(String[] args) {
		System.out.println("Enter the range for the Series :");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		System.out.println("Given Number :" + range);
		int[] Arr = new int[range];
		int j = 1;

	
		for (int i = 0; i < range; i++) {

			Arr[i] = j;
			j = j * 10 + 1;

		}
		System.out.println("series is  :" + Arrays.toString(Arr));
		System.out.println("Sum of the Series   :" + Arrays.stream(Arr).sum());
	}
}