import java.util.*;
import java.util.Scanner;
public class ArraySmallestElement 
{
public static void main(String[] args){
    
    int[] arr={22,56,78,66,33};
    int small=Integer.MAX_VALUE;
    int i=0;
    while(i<arr.length){
        
        if(arr[i]<small){
            
            small=arr[i];
        }
        i++;
    }
    System.out.println("Smallest Element in Array is " + small);
}}