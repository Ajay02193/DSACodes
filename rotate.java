//WAP to print the rotation of a no according to the user

import java.util.*;
public class rotate {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n =scn.nextInt();
        System.out.println("Enter value of k for rotation:");
        int k = scn.nextInt();
        int temp=n,d=0;
        while(temp!=0){
            d++;
            temp=temp/10;
        }
        k%=d;
        if(k<0){
            k=d+k;
        }
        int pow=(int)(Math.pow(10,k));
        int a = n/pow;
        int b=n%pow;
        int shift =(int)(Math.pow(10,d-k));
        int ans =b*shift+a;

        System.out.println("Rotated no.: "+ans);
        scn.close();
    }
    
}
