import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        // System.out.println(n);
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //negatvie count
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
           
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                System.out.print(arr[i]+" ");
            }
           
        }
       
        
    }
}
