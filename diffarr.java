//Not solved yet Have some errors in the code

import java.util.*;

public class diffarr {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Array1 size: ");
        int n1=scn.nextInt();
        int[] arr1=new int[n1];
        System.out.println("Array1 elements: ");
        for(int i=0;i<n1;i++)
            arr1[i]=scn.nextInt();
        System.out.println("Array2 size: ");
        int n2=scn.nextInt();
        int[] arr2=new int[n2];
        System.out.println("Array2 elements: ");
        for(int i=0;i<n2;i++)
            arr2[i]=scn.nextInt();
        diffArray(arr1, arr2);
        scn.close();
    }

    public static void diffArray(int[] arr1,int[] arr2){
        int[] res=new int[arr2.length];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=i;
        int borrow=0;
        int diff=0;
        while(i>=0){
            diff=arr1[i]+borrow;
            if(j>=0)
                diff-=arr2[j];
            int temp=diff;
            if(diff<0)
                {temp+=10;
                    borrow=-1;}
            else
                borrow=0;
                res[k]=temp; 
                i--;j--;k--;               
        }
        diffArrayDisplay(res);
    }

    public static void diffArrayDisplay(int[] res) {
        int i=0;
        while(res[i]==0&&i<res.length)
            i++;
        System.out.println("Difference of 2 given arrays is: ");
             for(int j=i;j<res.length;j++)
                System.out.print(res[j]+" ");            
    }
    
}
