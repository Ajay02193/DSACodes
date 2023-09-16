
import java.util.*;
public class dectoanybase {
    public static long decimalToBase(long n,long b){
        long rem=0;
        long ans=0; int cnt=0;
        while(n!=0){
            rem=n%b;
            n=n/b;
            ans=ans*10+rem;cnt++;
        }
        for(int i=0;i<cnt;i++){
            rem=ans%10;
            ans=ans/10;
            n=n*10+rem;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Base: ");
        long b=scn.nextLong();
        System.out.println("Enter no.: ");
        long n=scn.nextLong();
        long ans=decimalToBase(n, b);
        System.out.println(n+" conversion from decimal to base "+b+" is "+ans);
        scn.close();
    }
    
}
