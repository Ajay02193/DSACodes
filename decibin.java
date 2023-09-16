import java.util.*;

public class decibin {
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
    public static long binaryToDecimal(long n){
        long ans=0;int mark=0;long flag=0;
        while(n!=0){    
            flag=n%10;
            mark++;
            
            for(int i=1;i<mark;i++){
                    flag=flag*2;
            }
            n=n/10;
            ans=ans+flag;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("1. Decimal to Binary\n2. Binary to Decimal ");
        int ch=scn.nextInt();
        if(ch==1){
            System.out.println("Enter a no. to convert: ");
        long n=scn.nextLong();
            long x=decimaToBinary(n);
            System.out.println("Decimal to binary converted no. is: "+x);}
        else if(ch==2){
            System.out.println("Enter a no. to convert: ");
        long n=scn.nextLong();
            long x =binaryToDecimal(n);
            System.out.println("Binary to decimal converted no. is: "+x);
        }
        else
            System.out.println("INVALID INPUT");
       scn.close();
    }
}
