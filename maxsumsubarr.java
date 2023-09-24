//Kadane's Algortithm to find sum of maximum sub array

import java.util.Scanner;

public class maxsumsubarr {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Array size: ");
        int n=scn.nextInt();
        System.out.println("Array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        maxSumSub(arr,n);
        scn.close();
    }

    public static void maxSumSub(int[] arr, int n)
    {
        int currs=arr[0];
        int maxs=arr[0];
        for(int i=1;i<n;i++)
        {
            if(currs<0)
                currs=arr[i];   //new start
            else    
                currs+=arr[i];  //current start
            if(currs>maxs)
                maxs=currs;     //max sum
        }
        System.out.println("Sum of max. subarray for the given array is: "+maxs);
    }
    
}
