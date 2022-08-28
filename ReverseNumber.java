
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int rem=0;
        int rev=0;
        int diff;
        diff=num - rev;
        while(num>0){
            
            rev=(rem*10)+num%10;
            num=num/10;
            System.out.print(rev);
          
        }

        diff=num-rev;
        
        System.out.println(diff);
      
	}
}

