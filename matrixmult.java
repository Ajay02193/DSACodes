import java.util.*;

public class matrixmult{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Rows and columns for array 1: ");
        int r1=scn.nextInt();
        int c1=scn.nextInt();
        System.out.println("Matrix 1: ");
        int[][] mat1=new int[r1][c1];
        for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
                mat1[i][j]=scn.nextInt();
        System.out.println("Rows and columns for array 2: ");
        int r2=scn.nextInt();
        int c2=scn.nextInt();
        System.out.println("Matrix 2: ");
        int[][] mat2=new int[r2][c2];
        for(int i=0;i<r2;i++)
            for(int j=0;j<c2;j++)
                mat2[i][j]=scn.nextInt();
        if(c1==r2)
            matrixMultiplication(mat1,r1,mat2,r2,c2);
        else
            System.out.println("Invalid Input");
        scn.close();
    }

    public static void matrixMultiplication(int[][] mat1,int r1,int[][] mat2,int r2,int c2){
        int[][] mat=new int[r1][c2];
        int r=r1,c=c2;
        for(int i=0;i<r;i++)
        { 
            for(int j=0;j<c;j++){  
                int sum=0;
                for(int k=0;k<r2;k++)
                    sum+=mat1[i][k]*mat2[k][j];
                mat[i][j]=sum;
            }
        }
        matrixDisplay(mat,r,c);
    }

    public static void matrixDisplay(int[][] mat,int r,int c){
        System.out.println("Matrix Product: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
}