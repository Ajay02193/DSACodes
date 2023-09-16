import java.util.*;

public class prime{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i =1; i<=t;i++)
        {
            int num=scn.nextInt();
            boolean isPrime = true;
            for(int div=2;div*div<=num;div++)
            { 
                if(num % div==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==true){
            System.out.println(num+" prime");
            }else{
            System.out.println(num+" Not prime");}
        }
        scn.close();

    }
}