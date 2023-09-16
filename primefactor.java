import java.util.*;

public class primefactor {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n=scn.nextInt();
        int div=2;
        System.out.println("Prime factors of "+n+" are: ");
        while(div*div<=n){
            if(n%div==0){
                System.out.print(div+" ");
                n/=div;
            }
            else div++;
        }
        System.out.print(n);
        scn.close();
    }
    
}
