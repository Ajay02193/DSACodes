import java.util.*;
public class pat17 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int n=scn.nextInt();
        int x=n/2;
        for(int i=1;i<=n;i++){
           for(int j=n/2+1;j>=i;j--) 
            { System.out.print("* ");
        }
        if(i>n/2+1){for(int j=x;j<i;j++){
            System.out.print("* ");
        }}
           
            System.out.println();
        }
        scn.close();
    }
    
}
