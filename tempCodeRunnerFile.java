import java.util.*;

public class anybasesub {
    public static long anyBaseSub(long n1,long n2,long b){
        long ans=0,rem1=0,rem2=0,rem=0,pow=1,sub=0,borrow=0;
        if(n2>n1){
            long temp=n1;
            n1=n2;
            n2=temp;
        }
        else{
        while(n2>0){
            rem1=n1%10;
            rem2=n2%10;

            n1=n1/10;
            n2=n2/10;

            sub=(rem2+borrow)-rem1;
            rem=sub;
            if(sub<0){
                rem=rem+b;
                borrow=-1;
            }
            else    
                borrow=0;
            ans=ans+rem*pow;
            pow=pow*10;
        }}
        return ans;
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Base: ");
        long b=scn.nextLong();
        System.out.println("n1: ");
        long n1=scn.nextLong();
        System.out.println("n2: ");
        long n2=scn.nextLong();
        long ans=anyBaseSub(n1, n2, b);
        System.out.println("Difference of "+n1+" and "+n2+" at base "+b+" is "+ans);
        scn.close();
    }
    
}
