import java.util.*;

public class subarray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Array size: ");
        int n=scn.nextInt();
        System.out.println("Array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        subArray(arr,n);
        scn.close();
    }

    public static void subArray(int[] arr, int n){
        System.out.println("Sub Arrays: ");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++)
                    System.out.print(arr[k]+" ");
                System.out.println();
            }
        }
    }
}
