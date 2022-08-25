import java.util.*;
import java.util.Scanner;
public class ArrayLargestElement 
{
public static void main(String[] args){
    
    int[] arr={22,56,78,66,33};
    int large=Integer.MIN_VALUE;
    int i=0;
    while(i<arr.length){
        
        if(arr[i]>large){
            
            large=arr[i];
        }
        i++;
    }
    System.out.println("Largest Element in Array is " + large);
}}