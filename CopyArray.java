
public class CopyArray {
    public static void main(String args[]) {
      int[] arr1={27,37,98,76,78};
      int[] arr2=arr1;
      
System.out.println("copying array");
for(int i=0;i<arr1.length;i++){
    System.out.print(arr2[i]+ "\t");
}
    }
}
