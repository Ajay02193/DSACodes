/*Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:
Input:
N = 5
A[] = {1,2,3,5}
Output: 4

Example 2:
Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9 */

import java.util.*;
public class misselem{
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter array size: ");
    int n=scn.nextInt();
    System.out.println("Enter array elements between 1 to "+n);
    int[] a =new int[n];
    int as=0;
    for(int i=1;i<n;i++){
        a[i]=scn.nextInt();
        as+=a[i];
    }
    int ans=(n*(n+1)/2)-as;
    System.out.println("Missing Element: "+ans);
    
    scn.close();
    }
}