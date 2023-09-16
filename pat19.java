import java.util.*;
public class pat19 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;)
               { System.out.print(" ");j--;}
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        scn.close();
    }
    
}
