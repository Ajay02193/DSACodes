import java.util.*;

public class rotatearr {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Array size: ");
        int n=scn.nextInt();
        System.out.println("Array Elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        System.out.println("Rotation value: ");
        int k=scn.nextInt();
        rotateArray(arr,n,k);
        scn.close();
    }

    public static void rotateArray(int[] arr, int n, int k){
        k=k%n;
        if(k<0)
            k+=n;
        int flag=n-k-1;
        int pnt=flag+1;
        int i=0;
        while(flag>=0&&i<flag) {
            int temp=arr[i];
            arr[i]=arr[flag];
            arr[flag]=temp;
            flag--;i++;
        }
        k=pnt;
        i=n-1;
        while(i>=k&&k<n){
            int temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
            i--;k++;
        }
        i=0;
        k=n-1;
        while(i<n/2)
            {
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                i++;k--;
            }
        System.out.println("Rotated array is: ");
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
