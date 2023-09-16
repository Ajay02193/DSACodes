import java.util.*;
public class pat3 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n=scn.nextInt();
        int spc=1,stc=(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=stc;j++)
                System.out.print("*");
            for(int j=1;j<=spc;j++)
                System.out.print(" ");
            for(int j=1;j<=stc;j++)
                System.out.print("*");
            System.out.println();
            if(i<=n/2){
                stc--;
                spc+=2;
            }
            else if(i>n/2){
                stc++;
                spc-=2;
            }
        }

        scn.close();
    }
    
}
