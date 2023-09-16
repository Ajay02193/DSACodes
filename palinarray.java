/*Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

Example 1:

Input:
5
111 222 333 444 555

Output:
1

Explanation:
A[0] = 111 //which is a palindrome number.
A[1] = 222 //which is a palindrome number.
A[2] = 333 //which is a palindrome number.
A[3] = 444 //which is a palindrome number.
A[4] = 555 //which is a palindrome number.
As all numbers are palindrome so This will return 1.
Example 2:

Input:
3
121 131 20
 
Output:
0

Explanation:
20 is not a palindrome hence the output is 0.
 */

 import java.util.*;
public class palinarray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scn.nextInt();
        int[] arr= new int[n];
        int[] temp=new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i<n; i++){
            arr[i]=scn.nextInt();
            temp[i]=arr[i];
        }
        int[] chk=new int[n];
        boolean palArr = true;
        for(int i=0;i<n;i++){
            chk[i]=0;
            while(temp[i]!=0){
                int a=temp[i]%10;
                chk[i]=chk[i]*10+a;
                temp[i]/=10;
            }
            if(chk[i]!=arr[i]){
                palArr=false;
                break;
            }
        }
        if(palArr==true)
            System.out.println("Given Array is a pallindromic array.");
        else
            System.out.println("Given Array is not a pallindromic array.");
        scn.close();
    }
}
