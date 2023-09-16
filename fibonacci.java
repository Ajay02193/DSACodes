import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("No. of Digits to be printed for Fibonacci Series: ");
        int n=scn.nextInt();
        int a=0,b=1,c=0;
        for(int i = 0;i<n;i++){
        System.out.println(a);
        c=a+b;
        a=b;
        b=c;
        }
        scn.close();
    }
    
}
