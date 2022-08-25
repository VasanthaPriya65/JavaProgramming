import java.util.*;
import java.util.Scanner;
public class LargestNumber 
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n1,n2,n3,largest;
System.out.println("Enter the First Number");
n1=sc.nextInt();
System.out.println("Enter the Second Number");
n2=sc.nextInt();
System.out.println("Enter the Second Number");
n3=sc.nextInt();

if(n1>n2 && n1>n3)
{
    largest=n1;
    System.out.println(largest);
}
else if(n2>n1 && n2>n3)
{
    largest=n2;
    System.out.println(largest);
}
else{
    largest=n3;
}
System.out.printf("largest among %d  %d and %d is %d",n1,n2,n3,largest);
}}