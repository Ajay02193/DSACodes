/*You are given a number N. You need to print the pattern for the given value of N.

For N = 2 the pattern will be 
2 2 1 1
2 1

For N = 3 the pattern will be 
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1
 */

 import java.util.*;
public class pat1 {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Pattern Size: ");
        int n = scn.nextInt();
        for(int i=n;i>0;i--){
            System.out.println("");
            for(int j=n;j>0;j--){
                for(int k=i; k>0;k--)
                    System.out.print(""+j);
            }
        }
        scn.close();
    }

    
}
