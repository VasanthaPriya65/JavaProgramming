public class FrequencyofElements {
    public static void main(String args[]) {
        int arr[]=new int[]{10,20,30,40,10,20,30,40,10,20};
        int freq[]=new int[arr.length];
            for(int i=0;i<arr.length;i++){
                
            int no=arr[i];
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==no)
            {
                count++;
                freq[j]=-1;
                
            }}
            if(freq[i]!=-1){
            freq[i]=count;
            }
            }
            for(int i=0;i<arr.length;i++){
                if(freq[i]>0){
            System.out.println(arr[i] + " ocuurs " + freq[i]);
                }
    }}
}



