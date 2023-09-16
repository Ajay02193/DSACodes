import java.util.*;
public class pat24{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            if(i==(n+1)/2&&n%2!=0)
                for(int j=1;j<=n/2;j++)
                System.out.print("* ");
            else if((i==n/2&&n%2==0)||i==(n/2)+1&&n%2==0)
                for(int j=1;j<=n/2;j++)
                System.out.print("* ");
            else
                 for(int j=1;j<=n/2;j++)
                    System.out.print("  ");
                
            if(i<=(n+1)/2)
               { for(int j=1;j<=i;j++)
                    System.out.print("* ");}
            else if(i>n/2)
               { for(int j=n;j>=i;j--)
                    System.out.print("* ");}
            System.out.println();
        }
        scn.close();
    }
}