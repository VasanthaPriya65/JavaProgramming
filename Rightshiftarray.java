import java.util.*;
public class Rightshiftarray{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the length");
	    int length=sc.nextInt();
	    int[] arr=new int[length];
	    System.out.println("Enter the elements of an array:");
	    for(int i=0;i<length;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	   
	    int temp=arr[length-1];
	    
	    for(int j=length-1;j>0;j--)
	    {
	        arr[j]=arr[j-1];
	       
	    }
	    
	    arr[0]=temp;
	
	    for(int i=0;i<length;i++)
	    {
	        System.out.println(arr[i]);
	    }
	}
	
}

    
     