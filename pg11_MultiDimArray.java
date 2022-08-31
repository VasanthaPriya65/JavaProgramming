import java.util.Scanner;

public class pg11_MultiDimArray {
	public static void main(String[] args) {
         int[] arr1 = new int[] { 1, 2, 3, 4, 5 };

		
		System.out.println("Original array: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("\n\nEnter number of times array has to rotate: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		
		for (int i = 0; i < n; i++) {
			int j, firstTemp;
			firstTemp = arr1[0];

			
			for (j = 0; j < arr1.length - 1; j++) {
				arr1[j] = arr1[j + 1];
			}
			
			
			arr1[j] = firstTemp;
		}

	
		System.out.println("\nResult array after left rotation: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

}
