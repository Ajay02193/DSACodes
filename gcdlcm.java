import java.util.*;
public class gcdlcm {
    public static void main( String[] args){
        Scanner scn =new Scanner(System.in);
        System.out.println("n1: ");
        int n1=scn.nextInt();
        System.out.println("n2: ");
        int n2=scn.nextInt();
        int gcd=0;
        int dividend=n1;
        int divisor=n2;
        while(dividend%divisor!=0){
            int rem=dividend%divisor;
            dividend=divisor;
            divisor=rem;
        }
        gcd=divisor;
        int lcm=(n1*n2)/gcd;
        System.out.println("GCD of "+n1+" and "+n2+" is "+gcd);
        System.out.println("LCM of "+n1+" and "+n2+" is "+lcm);
        scn.close();
    }
    
}
