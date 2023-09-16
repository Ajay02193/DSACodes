import java.util.*;
public class fact {
    public static int facto(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact=fact*i;
        return fact;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n=scn.nextInt();
        int fact=facto(n);
        System.out.println("Factorial of "+n+" is "+fact);


        scn.close();;
    }
    
}
