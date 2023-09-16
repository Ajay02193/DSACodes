import java.util.*;
public class nwithoutloop {
    static void callnumber(int x,int j){
        if(j<=x)
        {
            System.out.print(" "+j);
            j++;
            callnumber(x,j);
        }
    }
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter total no.s to print: ");
        int n = scn.nextInt();
        int i=1;
        callnumber(n,i);
        scn.close();

    }
    
}
