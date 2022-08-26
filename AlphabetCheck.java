import java.util.*;
public class AlphabetCheck {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     char ch=sc.next().charAt(0);
     if((ch>='a' && ch>='z') || (ch>='A' && ch>='Z')){
         
        System.out.println("Given character is an alphabet");
     }
     else {
     
           System.out.println("Given character is not an alphabet");

    }}
}
