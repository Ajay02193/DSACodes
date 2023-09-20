import java.util.*;

public class arrsum {
    public static int[] arraySum(int[] arr1,int[] arr2){
       int n=arr1.length>arr2.length?(arr1.length+1):(arr2.length+1);
        int[] res=new int[n];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=res.length-1;
        int carry=0;
        int sum=0;
        while(k>=0){
            sum=carry;
            if(i>=0)
                sum+=arr1[i];
            if(j>=0)
                sum+=arr2[j];
            int rem=sum%10;
            carry=sum/10;
            res[k]=rem;
            k--;i--;j--;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Array Size1: ");
        int n1=scn.nextInt();
        System.out.println("Array1 Elements: ");
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++)
            arr1[i]=scn.nextInt();
        System.out.println("Array Size2: ");
        int n2=scn.nextInt();
        System.out.println("Array2 Elements: ");
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++)
            arr2[i]=scn.nextInt();
            scn.close();
        int[] sum =arraySum(arr1,arr2);
        int x=sum.length;
        for(int i=0;i<x;i++){
            if(i==0&&sum[0]==1)
                   System.out.print(sum[i]+" ");
            else if(i>0)
                    System.out.print(sum[i]+" ");
        }
    } 
}
