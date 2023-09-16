import java.util.*;
public class pat22 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter no. to generate table: ");
        int n=scn.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
        scn.close();
    }
    
}
