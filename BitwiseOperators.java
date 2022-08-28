
import java.util.Scanner;

public class BitwiseOperators {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
//*Bitwise Operators
       

        c=a&b;
        System.out.println("AND operator " + c);
        
        c=a|b;
        System.out.println("OR operator " + c);
        
        c=a^b;
        System.out.println("EXOR operator " + c);
        
        c=~a;
      System.out.println("NOT operator  " + c);
	}
}

