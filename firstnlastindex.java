 import java.util.Scanner;

public class firstnlastindex {
   

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Array size: ");
        int n=scn.nextInt();
        System.out.println("Array elements in Ascending order format: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Enter element to be searched: ");
        int find=scn.nextInt();
        binarySearch(arr,n,find);
        scn.close();
    }

    public static void binarySearch(int[] arr, int n,int find){
        int min=0,max=n-1;
        int mid=(min+max)/2;
        while(min<=max){
            if(arr[mid]==find)
            {   

                FirstLastIndex(arr,mid);
            }
            else
            {
                if(find<arr[mid])
                    max=mid-1;
                if(find>arr[mid])
                    min=mid+1;
                mid=(min+max)/2;
            }
        }
        if(arr[mid]!=find)
            System.out.println("Element not found or invalid input");
    }

    public static void FirstLastIndex(int[] arr,int mid){
        int first=mid,last=mid;
        int i=mid,j=mid;
        while(arr[i]==arr[mid]){
            first=i;
            i--;
        }
        while(arr[j]==arr[mid]){
            last=j;
            j++;
        }
        System.out.println("First Index: "+first+"\tLast Index: "+last);
        System.exit(0);
    }
}

    

