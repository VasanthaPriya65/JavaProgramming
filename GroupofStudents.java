import java.util.*;
public class GroupofStudents{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter starting roll number : ");
         int startnum=sc.nextInt();
         System.out.println("Enter end roll number : ");
         int endnum=sc.nextInt();
         System.out.println("Enter total number of groups : ");
         int groupcount=sc.nextInt();
         System.out.println("Enter number of students in a group : ");
         int total=sc.nextInt();
         int i,j,k;
         k=0;
         
         for(i=startnum;i<endnum;i++)
         {
             System.out.println("Group no: "+(k+1));
             k=k+1;
             for(j=i;j<120;j=j+4)
             
             {
                System.out.println(j);
             }
         }