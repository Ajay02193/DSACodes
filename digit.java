//WAP to print the digits of no. from left to right

import java.util.*;
public class digit {
    public static void main( String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n= scn.nextInt();
        System.out.println("Digits are: ");
        while(n!=0){
           int d=n%10;
           System.out.println(d);
           n=n/10;
        }

        scn.close();
    }
    
}
