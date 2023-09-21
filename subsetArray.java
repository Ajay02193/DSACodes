import java.util.Scanner;

public class subsetArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Array size: ");
        int n=scn.nextInt();
        System.out.println("Array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        subSet(arr,n);
        scn.close();
    }

    public static void subSet(int[] arr, int n){
        
        int ts=1;
        for(int i=1;i<=n;i++)
            ts=ts*2;
        System.out.println("Subsets of given array is: ");
        for(int i=0;i<ts;i++)
        {
            int[] bin=getBinary(i,n);

            for(int j=0;j<n;j++){
                if(bin[j]!=0)
                    System.out.print(arr[j]+" ");
                else
                    System.out.print("- ");
            }
            System.out.println(" ");
        }    
    }

    public static int[] getBinary(int i, int n){
        int[] arr=new int[n];
        int j=n-1;
        while(i>0)
        {       
            int rem=i%2;
            i=i/2;
            arr[j]=rem;
            j--;

        }
        return arr;
    }
}
