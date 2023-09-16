import java.util.*;

public class benjbulb {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Total no. of bulbs: ");
        int n = scn.nextInt();
        scn.close();
        int i=1;
        System.out.println("Total no. of bulbs in on condition after final toggling: ");
        for(i=1;i*i<=n;i++){
            System.out.println(" Bulb "+i*i);
        }
    }
}
