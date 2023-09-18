import java.util.*;

public class anybasemult {

    
    public static long getPro(long rem1, long n2, long b){
        long rem2=0;long ans=0;
        long carry=0;
        long rem=0;
        long pow=1;
        while(n2>0||carry>0){
            rem2=n2%10;
            n2=n2/10;
            long mult=rem1*rem2+carry;
            rem=mult%b;
            carry=mult/b;

            ans=rem*pow+ans;
            pow*=10;
        }
        return ans;
    }

    public static long proAdd(long n1, long n2, long b){
        long rem1=0,rem2=0,pow=1,ans=0,carry=0,rem=0,sum=0;
        while(n1>0||n2>0||carry>0){
            rem1 =n1%10;
            rem2=n2%10;

            n1=n1/10;
            n2=n2/10;

            sum=rem1+rem2+carry;
            carry=sum/b;
            rem=sum%b;

            ans=rem*pow+ans;
            pow*=10;
            
        }

        return ans;
    }

    public static long mult(long n1, long n2, long b){
        long rem1=0;
        long ans=0;
        long pow=1;
        while(n1>0){
            rem1=n1%10;
            n1=n1/10;
            long inter=getPro(rem1,n2,b);
            ans=proAdd(ans,inter*pow,b);
            pow*=10;
        }
        return ans;
    }


    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("base: ");
        long b=scn.nextLong();
        System.out.println("n1: ");
        long n1=scn.nextLong();
        System.out.println("n2: ");
        long n2=scn.nextLong();
        long ans=mult(n1,n2,b);
        System.out.println("Product of "+n1+" and "+n2+" for base "+b+" is "+ans);
        scn.close();
    } 


   
    
}
