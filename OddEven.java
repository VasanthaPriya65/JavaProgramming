import java.util.*;
public class OddEven 
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int rem=num%2;

if(rem==0)
{
    System.out.println("Even Number");
}
else if(rem==1)
{
System.out.println("OddNumber");
}
}
}