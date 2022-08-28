import java.util.*;
public class QuotiendAndReminder{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Divident number: ");
        
        int divident=sc.nextInt();
        
        System.out.println("Enter Divisor number: ");
        int divisor=sc.nextInt();
        
        int quotient=divident/divisor;
        int reminder=divident%divisor;
        
        
        System.out.println("Quotiend = " + quotient );
        System.out.println("Reminder = " + reminder);
    }
}