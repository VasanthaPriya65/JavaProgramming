import java.util.*;
public class RectangleArea{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int length,breath,area;
         System.out.println("Enter the side length of a rectangle : ");
         length=sc.nextInt();
         System.out.println("Enter the side breath of a rectangle : ");
         breath=sc.nextInt();
         area=length*breath;
         System.out.println("Area of a rectangle " +area);
     }}