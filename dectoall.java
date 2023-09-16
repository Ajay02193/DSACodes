import java.util.*;

public class dectoall {
    public static long decimaToBinary(long n){
        long ans=0;long flag=0;int cnt=0;
        while(n!=0){
            flag=n%2;
            n=n/2;
            ans=flag+ans*10;
            cnt++;
        }
        for(int i=0;i<cnt;i++){
            flag=ans%10;
            ans=ans/10;
            n=n*10+flag;
        }
        return n;
    }
    public static long decimaToOctal(long n){
        long ans=0;long flag=0;int cnt=0;
        while(n!=0){
            flag=n%8;
            n=n/8;
            ans=flag+ans*10;
            cnt++;
        }
        for(int i=0;i<cnt;i++){
            flag=ans%10;
            ans=ans/10;
            n=n*10+flag;
        }
        return n;}
    /*public static long decimaToHexa(long n){
        long ans=0;long flag=0;int cnt=0;
        while(n!=0){
            flag=n%16;
            n=n/16;
            ans=flag+ans*10;
            cnt++;
        }
        for(int i=0;i<cnt;i++){
            flag=ans%10;
            ans=ans/10;
            n=n*10+flag;
        }
        if
        return n;}*/

    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("1. Decimal to Binary\n2.Decimal to Octal");
        int ch=scn.nextInt();
        if(ch==1)
        {
            System.out.println("Enter no. to convert: ");
            long n=scn.nextLong();
            long ans= decimaToBinary(n);
            System.out.println("COnverted no.from decimal to binary: "+ans);
        }
        else if(ch==2)
        {
            System.out.println("Enter no. to convert: ");
            long n=scn.nextLong();
            long ans= decimaToOctal(n);
            System.out.println("COnverted no.from decimal to octal: "+ans);
        }
        scn.close();
        }
        
    }
    

