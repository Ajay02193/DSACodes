/*In a country of novice government, the economic system is changed where only coins are used that too of various denominations. 
Whenever a foreigner visits this country, they visit a money exchanger to get the currency of the same country. 
As the foreigner is unaware of the denomination of the country, the money exchange prefers to tell them the denomination which is 
the nearest maximum and nearest minimum to the denomination mentioned by the foreigner. 
In case they get the correct guess of the denomination, they are told the same denomination. 
The denominations are always quoted in ascending order,

Example 1: In a country, 8 given denominations are as follows [5, 10, 15, 22, 33, 40, 42, 551

The foreigner asks for denomination 25.

The money exchange tells them that denominations of 33 and 22 are available */

import java.util.Scanner;

public class brokeneco {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Array size: ");
        int n=scn.nextInt();
        System.out.println("Array elements in Ascending order format: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Enter element to be searched: ");
        int find=scn.nextInt();
        brokenEconomy(arr,n,find);
        scn.close();
    }

    public static void brokenEconomy(int[] arr, int n, int find){
        int ceil=0,floor=0;
        int min=0,max=n-1;
        int mid=(min+max)/2;
        while(min<=max){
            if(arr[mid]==find){
                floor=mid;
                ceil=mid;
                break;
            }
            else{
                if(arr[mid]<find)
                   { floor=mid;
                     min=mid+1;
                   }
                if(arr[mid]>find)
                   {  ceil=mid;
                      max=mid-1;
                   }
            }
            mid=(min+max)/2;
        }
        if(arr[mid]==find||arr[floor]<find&&arr[ceil]>find)
            System.out.println("Floor: "+arr[floor]+"\tCeil: "+arr[ceil]);
        else 
            System.out.println("INVALID INPUT");
    }
}
