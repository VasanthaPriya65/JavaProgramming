import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Arrays;
public class ReverseString {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string : ");
String givenstr=sc.nextLine();
String[] a=givenstr.split(" ");
for(int i=0;i<a.length;i++)
{
    System.out.print(a[i]+" ");
    
}
System.out.println (" ");
for(int i=a.length-1;i>=0;i--){
    
    System.out.print(a[i]+" ");
    
}
}
}