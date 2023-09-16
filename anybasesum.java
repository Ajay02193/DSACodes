import java.util.*;

public class anybasesum {
    public static long anyBaseSum(long n1,long n2,long b){
    long ans=0;
    long pow=1;long carry=0;
    long rem1=0;long rem2=0;long rem=0;
    long sum=0;
    {
        while(n1>0||n2>0||carry>0){
            rem1=n1%10;
            rem2=n2%10;

            n1=n1/10;
            n2=n2/10;

            sum=rem1+rem2+carry;
            rem=sum%b;
            carry=sum/b;

            ans+=rem*pow;
            pow=pow*10;
        }
    }
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
        long ans=anyBaseSum(n1, n2, b);
        System.out.println("Sum of "+n1+" and "+n2+" for base "+b+" is "+ans);
        scn.close();
    }
}
