import java.util.*;
public class inverarr {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Array Size: ");
        int n = scn.nextInt();
        System.out.println(" Array elements: between 0 to "+(n-1));
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        inverseArray(arr,n);
        scn.close();
    }

    public static void inverseArray(int[] arr, int n){
        int[] invarr=new int[n];
        for(int i=0;i<n;i++)
           { int idx=i;
            int val=arr[i];
            invarr[val]=idx;}
        for(int i=0;i<n;i++){
            arr[i]=invarr[i];
        }
        
        showArray(arr);
    }

    public static void showArray(int[] arr){
        System.out.println("Inverse of th given array is: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
