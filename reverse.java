//WAP to print the digits of a no. from left to right in order

import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n = scn.nextInt();
        int d=0,temp=0,pow=1;
        temp=n;
        while(temp!=0){
            d++;
            temp=temp/10;
        }
        int i=0;
        while(i<d-1){
            pow*=10;
            i++;
        }
        System.out.println("Digits are: ");
        while(d>0)
        {
            int dig=n/pow;
            System.out.println(dig);
            n=n%pow;
            pow=pow/10;
            d--;
        }
        scn.close();
    }
}
