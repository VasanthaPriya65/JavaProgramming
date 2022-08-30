import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class pg54_OddEvenarraysort{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lenght of the Array ");
		int n = sc.nextInt();

		int[] arr= new int[n];
		
		
		List<Integer> oddposition= new ArrayList<Integer>();
		List<Integer> evenposition= new ArrayList<Integer>();
		
	
		System.out.println("Enter the elements of the array: ");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("After Sorting : ");
		
		
		for (int j = 0; j < n; j = j + 2) {
			oddposition.add(arr[j]);
		}
		Collections.sort(oddposition,Collections.reverseOrder());
		System.out.println(oddposition);
		

		for (int i = 1; i < n; i = i + 2) {
			evenposition.add(arr[i]);
		}
		Collections.sort(evenposition);
		System.out.println(evenposition);
	}
}