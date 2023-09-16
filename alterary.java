import java.util.*;
public class alterary {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Array Elements: ");
        for(int i=0;i<n;i++)
         arr[i]=scn.nextInt();
        System.out.println("1. for odd index elements");
        System.out.println("2. for even index elements");
        int ch = scn.nextInt();
        if(ch==1)
        {   
            System.out.println("odd index elements are: ");
            for(int i=0;i<n;i++)
            {
                if(i%2!=0)
                System.out.print(arr[i]+" ");
            }
        }
        else 
        {   
            System.out.println("even index elements are: ");
            for(int i=0;i<=n;i++)
           {
            if(i%2==0)
            System.out.print(arr[i]+ " ");
            }

        }
        scn.close();
    }
    
}
