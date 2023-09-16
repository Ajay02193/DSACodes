import java.util.*;
public class pat9 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int n=scn.nextInt();
        int x=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(x+" ");
                if(x==0)
                    x=1;
                else
                    x=0;
            }
            if(i%2==0)
                x=0;
            else    
                x=1;
            System.out.println();
        }
        scn.close();
    }
    
}
