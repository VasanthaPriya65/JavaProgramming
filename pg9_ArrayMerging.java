import java.util.Arrays;
import java.util.LinkedHashSet;

public class pg9_ArrayMerging {
	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 5, 6, 7, 9, 10, 13 };
		int[] arr2 = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 15 };
		System.out.println("Given Array1 :");
		System.out.println(Arrays.toString(arr1));
		System.out.println("Given Array2 :");
		System.out.println(Arrays.toString(arr2));

		int index = 0;
		int num1 = arr1.length;
		int num2 = arr2.length;

		int num3 = num1 + num2;
		Integer[] arr3 = new Integer[num3];

		for (int i = 0; i < arr1.length; i++) {
			arr3[index] = arr1[i];
			index++;
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[index] = arr2[i];
			index++;
		}

	
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(arr3));

		Integer[] resultArray = linkedHashSet.toArray(new Integer[] {});

		Arrays.sort(resultArray);

		System.out.println("Merged Array :");
		System.out.println(Arrays.toString(resultArray));
	}
}