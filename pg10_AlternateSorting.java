import java.util.Arrays;
public class pg10_AlternateSorting {
	public static void alternateSort(int arr1[], int n) {
		
		Arrays.sort(arr1);
		int i = 0, j = n - 1;
		while (i < j) {
			System.out.print(arr1[j--] + " ");
			System.out.print(arr1[i++] + " ");
		}

		if (n % 2 != 0)
			System.out.print(arr1[i]);
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr1.length;
		alternateSort(arr1, n);
	}

}