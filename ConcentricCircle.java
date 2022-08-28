import java.util.*;
public class ConcentricCircle{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         double r1,r2,area;
         System.out.println("Enter the radius of a inner circle : ");
         r1=sc.nextInt();
         System.out.println("Enter the radius of a outer circle : ");
         r2=sc.nextInt();
         //area of space in between concentric circle =area of outer circle-area of inner circle
         area=(3.14*r2*r2)-(3.14*r1*r1);
         System.out.println("Space between circle " +area);
     }}