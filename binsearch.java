import java.util.Scanner;

public class binsearch {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Array size: ");
        int n=scn.nextInt();
        System.out.println("Array elements in sorted format: ");
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
        boolean res=false;
        int min=0,max=n-1;
        int mid=(min+max)/2;
        while(min<=max){
            if(arr[mid]==find)
            {
                res=true;
                break;
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
        if(res==true)
            System.out.println("Element found at index: "+mid+1);
        else
            System.out.println("Element not found or invalid input");
    }
}
