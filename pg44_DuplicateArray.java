import java.util.Scanner;

public class pg44_DuplicateArray {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of the Array ");
		int n = sc.nextInt();

	
		int[] arr = new int[n];

		System.out.println("Enter the elements of the array: ");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
	
		String resStr = "";
		int Count = 1;

		for (int i = 0; i < arr.length; i++) {
			Count = 1;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					Count++;
				}
			}

			if (Count > 1) {
				resStr = resStr + arr[i] + " ";
			}
		}
		if (resStr.length() > 0) {
			System.out.println("Duplicate Elements : " + resStr);
		} else {
			System.out.println(" There are no duplicates ");
		}
	}
}