import java.util.*;

public class barchart {
    public static void barChart(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        for(int h=max;h>0;h--){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=h)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Array Size: ");
        int n=scn.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        barChart(arr);
        scn.close();

    }
}
