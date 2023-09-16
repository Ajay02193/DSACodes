import java.util.*;
public class pat21 {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int n=scn.nextInt();
        int mark=1;int spc=n/2;
        int rst=1;
        for(int i=1;i<=n;i++){
            int x=i;
            for(int j=1;j<=spc;j++)
                System.out.print("  ");
                x=rst;
            for(int j=1;j<=mark;j++)
               { System.out.print(x+" ");
                    if(j<=mark/2)
                        x++;
                    else
                        x--;
                }
            if(i<=n/2)
                { 
                    spc--;
                    mark+=2;rst++;}
            else {
              mark-=2;spc++;rst--;}
            System.out.println();
        }
        scn.close();
    }
    
}
