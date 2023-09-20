import java.util.*;

public class revarray {
    public static void revArray(int[] arr, int n){
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        show(arr,n);

    }

    public static void show(int[] arr,int n){
        System.out.println("Reversed Array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Array size: ");
        int n=scn.nextInt();
        System.out.println("Array Elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        revArray(arr,n);
        scn.close();
    }
    
}
