import java.util.*;
public class ArrayOddPosition {
    public static void main(String args[]) {
        int arr[]=new int[]{22,37,66,86,45,55,32};
        for(int i=1;i<=arr.length;i=i+2){
            System.out.println("odd position elements are "+ arr[i]);
        }

    }
}
