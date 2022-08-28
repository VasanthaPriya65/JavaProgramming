import java.util.*;
public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=num;
        int sumfact=0;
        
        while(num>1){
            
            num--;
            sumfact=fact+num;
            fact=num*fact;
            
        }
        System.out.println("Factorial of number is : " +fact );
        System.out.println("Factorial of number is : " +sumfact );
        
    }
}