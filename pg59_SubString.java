import java.util.Scanner;
public class pg59_SubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str =sc.nextLine();
		System.out.println("Enter SubString : ");
		String subStr =sc.nextLine();
		int index;
		index = str.indexOf(subStr);
		if (index > 0)
			System.out.println("Given substring is available with start index : " + index);
		else
			System.out.println("Given substring is not available and hence returns : " + index);
	}


}