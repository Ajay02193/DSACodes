import java.util.*;
public class pat10 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--)
                System.out.print("  ");
            for(int j=i;j>=1;j--)
                System.out.print(j+" ");
            for(int j=2;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }   
        scn.close();
    }
    
}
