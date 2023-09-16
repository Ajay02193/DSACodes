import java.util.*;
public class pat4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("*");
            if(i==0||i==n-1){
                for(int j=1;j<n;j++){
                
                    System.out.print(" *");
            }
        }
        else{
            for(int j=1;j<n;j++){
            System.out.print("  ");}
        }
            
        System.out.print(" *");
        System.out.println();
        }
        scn.close();
    }
    
}
