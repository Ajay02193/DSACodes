import java.util.*;
public class pythtrip {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter Sides of triangle: ");
        int s1=scn.nextInt();
        int s2=scn.nextInt();
        int s3=scn.nextInt();
        boolean pyTri=false;
        if(s1*s1==s2*s2+s3*s3)
            pyTri=true;
        else if(s1*s1+s2*s2==s3*s3)
            pyTri=true;
        else if(s2*s2==s1*s1+s3*s3)
            pyTri=true;
        System.out.println("Sides of triangle are Pythagorean Triplet: "+pyTri);
        scn.close();
    }
}
