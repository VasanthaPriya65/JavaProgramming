
import java.util.*;
public class leftshiftarray{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the length");
	    int length=sc.nextInt();
	    int[] arr=new int[length];
	    
	    for(int i=0;i<length;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    
	    int temp=arr[0];
	    
	    for(int j=0;j<length-1;j++)
	    {
	        arr[j]=arr[j+1];
	        
	    }
	    
	    arr[length-1]=temp;
	
	    for(int i=0;i<length;i++)
	    {
	        System.out.println(arr[i]);
	    }
	}
	
}
    
     