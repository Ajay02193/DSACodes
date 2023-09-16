import java.util.*;
public class seriesavg {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //long Start=System.currentTimeMillis();
        System.out.println("Enter size of array: ");
        int n = scn.nextInt();
        System.out.println("Enter no.s: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();}
         // int[] sr = new int[n];
        int sum=0,d=1;
        System.out.println("Series Average: ");

        long Start=System.currentTimeMillis();

        for(int i=0;i<n;i++)
        {   
            sum=sum+arr[i];
            int ans= sum/d;
            System.out.print(ans+" ");d++;
        }


        long finish=System.currentTimeMillis();
        long res=finish-Start;
            
        System.out.println("Execution Time: "+res);
        scn.close();
    }
    
}
