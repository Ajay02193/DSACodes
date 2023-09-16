import java.util.*;
public class pat20 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int n=scn.nextInt();
        int x=n/2;
        for(int i=1;i<=n;i++)
        {
            if(i<=n/2+1){
                for(int j=1;j<i;j++)
                    System.out.print(" ");
                for(int j=i;j<=n/2+1;j++)
                    System.out.print(j+" ");
            }
            
            else{
                for(int j=n;j>i;j--)
                    System.out.print(" ");
                for(int j=x;j<=n/2+1;j++)
                    System.out.print(j+" ");
                x--;
            }
            System.out.println();
        }
        scn.close();
    }
    
}
