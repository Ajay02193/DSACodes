import java.util.Scanner;

public class inverse {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n=scn.nextInt();
        int faceval=0;
        int inv=0;
        int rightdigit=0;
        while(n!=0){
            faceval++;
            rightdigit=n%10;
            n/=10;
            inv= inv+faceval*(int)(Math.pow(10,rightdigit-1));

        }
        System.out.println("Inverse: "+inv);
        scn.close();
    }
    
}
