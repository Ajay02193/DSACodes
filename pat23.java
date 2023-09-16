import java.util.*;
public class pat23 {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int n=scn.nextInt();
        int spc=2*n-3;
        for(int i=1;i<=n;i++){
            int lv=1;
            for(int j=1;j<=i;j++){
                System.out.print(lv+" ");
            lv++;}
            for(int j=1;j<=spc;j++)
               { System.out.print("  ");}
            int rcnt=(i==n)?i-1:i;
            /*if(i==n)
                rcnt=i-1;
              else
                rcnt=i;
             */
            int rv=rcnt;
            for(int j=1 ;j<=rcnt;j++)
                {System.out.print(rv+" ");
            rv--;}
            System.out.println();
            spc-=2;
            }
        scn.close();
    }
    
}
