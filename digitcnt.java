import java.util.*;
public class digitcnt {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n= scn.nextInt();
        System.out.println("Enter the digit to search: ");
        int d=scn.nextInt();
        int f=digit(n,d);
        System.out.println("Total no. of "+d+"s in "+n+" is "+f);
        scn.close();;
    }
    public static int digit(int n, int d){
        int cnt=0;int x=0;
        while(n!=0){
            x=n%10;
            n=n/10;
            if(x==d)
                cnt++;
        }
        return cnt;
    }
}
