import java.util.*;

public class spanarr {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Array Size: ");
        int n=scn.nextInt();
        System.out.println("Array Elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        SpanArray(arr);
        scn.close();
    }

    public static void SpanArray(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
            if(min>arr[i])
                min=arr[i];
        }
        int span=max-min;

        System.out.println("Span of given array is "+span);
    }
    
}
