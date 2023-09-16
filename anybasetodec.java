import java.util.*;

public class anybasetodec {
    public static long baseToDecimal(long n,long b){
        long rem=0;
        int mark=0;
        long ans=0;
        while(n!=0){
            rem=n%10;
            n=n/10;
            mark++;
            for(int i=1;i<mark;i++)
                rem=rem*b;
            ans=ans+rem;
        }
        return ans;

    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter base: ");
        long b=scn.nextLong();
        System.out.println("Enter no.: ");
        long n=scn.nextLong();
        long ans=baseToDecimal(n, b);
        System.out.println(n+" base "+b+" coversion to decimal is "+ans);
        scn.close();
    }
}
