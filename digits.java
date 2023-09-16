import java.util.*;
public class digits {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n = scn.nextInt();
        int d=0;
        while(n!=0){
            d++;
            n=n/10;
        }
        System.out.println("Total no. of digits: "+d);
        scn.close();
    }
    
}
