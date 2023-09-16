import java.util.*;
public class pat2 {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n=scn.nextInt();    
        int spc=n/2;
        int str=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<spc;j++){
                System.out.print("\t");
            }
            for(int j=0;j<str;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<n/2){
                spc--;
                str+=2;
            }
            else if(i>=n/2)
            {
                spc++;
                str-=2;
            }
        }
        scn.close();
    }
}
