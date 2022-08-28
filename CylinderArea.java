import java.util.*;
public class CylinderArea{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         double radius,height,area;
         System.out.println("Enter the radius of a cylinder : ");
         radius=sc.nextInt();
         System.out.println("Enter the height of a cylinder : ");
         height=sc.nextInt();
         //area of cylinder=2*3.14*r*(r+h)
         area=(2*3.14*radius*(radius+height));
         System.out.println("Area of a rectangle " +area);
     }}