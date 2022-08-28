import java.util.Scanner;

public class AlphabetsPrint {

	public static void main(String[] args) {
		System.out.println("Enter the Alphabet");
		Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
		char c;
		if(ch>=65 && ch<=90) {
		    
		    for(c=ch;c<=90;c++){
          
			System.out.print(c);
		}

	}}

}

